package com.example.gpa_gottimukkalr1_calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
/* Calculating GPA based on the input provided by the user.
* Accepts input as alphabets, numeric won't print, shows background colors
* based on GPA percentage. Code can be optimized, but the code works fine.*/
public class MainActivity extends AppCompatActivity {
    private EditText Grade1, Grade2, Grade3, Grade4, Grade5;
    private Button computeGPA, erase;
    private TextView textView;
    View view;
    LinearLayout linearLayout1;
    double counter=0, total_credit=15, credit=3, grade1=0, grade2=0, grade3=0, grade4=0, grade5=0, total_grade=0;

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            checkEmptyFields();
        }

        @Override
        public void afterTextChanged(Editable editable) {
            computeGPA.setText("Compute GPA");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout1 = findViewById(R.id.linearLayout);

        //Credit = findViewById(R.id.editText1);
        Grade1 = (EditText) findViewById(R.id.editText1);
        Grade2 = (EditText) findViewById(R.id.editText2);
        Grade3 = (EditText) findViewById(R.id.editText3);
        Grade4 = (EditText) findViewById(R.id.editText4);
        Grade5 = (EditText) findViewById(R.id.editText5);

        Grade1.addTextChangedListener(textWatcher);
        Grade2.addTextChangedListener(textWatcher);
        Grade3.addTextChangedListener(textWatcher);
        Grade4.addTextChangedListener(textWatcher);
        Grade5.addTextChangedListener(textWatcher);

        textView = findViewById(R.id.textView);
        computeGPA = findViewById(R.id.button);
        //computeGPA.setEnabled(false);
        view= this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.white);

        final String grade_one = Grade1.getText().toString();
        final String grade_two = Grade2.getText().toString();
        final String grade_three = Grade3.getText().toString();
        final String grade_four = Grade4.getText().toString();
        final String grade_five = Grade5.getText().toString();

        computeGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources resource = getResources();
                String gradeValue = null;
                checkEmptyFields();

                // calculating grades
                try {
                    String g1 = Grade1.getText().toString();
                    if (g1.equals("A")){
                        gradeValue = resource.getString(R.string.A);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("A-")){
                        gradeValue = resource.getString(R.string.AMinus);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("B")){
                        gradeValue = resource.getString(R.string.B);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("B-")){
                        gradeValue = resource.getString(R.string.BMinus);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("C")) {
                        gradeValue = resource.getString(R.string.C);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("C-")) {
                        gradeValue = resource.getString(R.string.CMinus);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("D")) {
                        gradeValue = resource.getString(R.string.D);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("D+")) {
                        gradeValue = resource.getString(R.string.DPlus);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("D-")) {
                        gradeValue = resource.getString(R.string.DMinus);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("E")) {
                        gradeValue = resource.getString(R.string.E);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                    else if (g1.equals("F")) {
                        gradeValue = resource.getString(R.string.F);
                        grade1 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade1 is : "+grade1+ " " + gradeValue);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
                try {
                    String g2 = Grade2.getText().toString();
                    if (g2.equals("A")){
                        gradeValue = resource.getString(R.string.A);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("A-")){
                        gradeValue = resource.getString(R.string.AMinus);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("B")){
                        gradeValue = resource.getString(R.string.B);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("B-")){
                        gradeValue = resource.getString(R.string.BMinus);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("C")) {
                        gradeValue = resource.getString(R.string.C);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("C-")) {
                        gradeValue = resource.getString(R.string.CMinus);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("D")) {
                        gradeValue = resource.getString(R.string.D);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("D+")) {
                        gradeValue = resource.getString(R.string.DPlus);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("D-")) {
                        gradeValue = resource.getString(R.string.DMinus);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2);
                    }
                    else if (g2.equals("E")) {
                        gradeValue = resource.getString(R.string.E);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                    else if (g2.equals("F")) {
                        gradeValue = resource.getString(R.string.F);
                        grade2 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade2 is : "+grade2+ " " + gradeValue);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }

                try {
                    String g3 = Grade3.getText().toString();
                    if (g3.equals("A")){
                        gradeValue = resource.getString(R.string.A);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("A-")){
                        gradeValue = resource.getString(R.string.AMinus);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("B")){
                        gradeValue = resource.getString(R.string.B);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("B-")){
                        gradeValue = resource.getString(R.string.BMinus);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("C")) {
                        gradeValue = resource.getString(R.string.C);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("C-")) {
                        gradeValue = resource.getString(R.string.CMinus);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("D")) {
                        gradeValue = resource.getString(R.string.D);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("D+")) {
                        gradeValue = resource.getString(R.string.DPlus);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("D-")) {
                        gradeValue = resource.getString(R.string.DMinus);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("E")) {
                        gradeValue = resource.getString(R.string.E);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                    else if (g3.equals("F")) {
                        gradeValue = resource.getString(R.string.F);
                        grade3 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade3 is : "+grade3+ " " + gradeValue);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }

                try {
                    String g4 = Grade4.getText().toString();
                    if (g4.equals("A")){
                        gradeValue = resource.getString(R.string.A);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("A-")){
                        gradeValue = resource.getString(R.string.AMinus);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("B")){
                        gradeValue = resource.getString(R.string.B);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("B-")){
                        gradeValue = resource.getString(R.string.BMinus);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("C")) {
                        gradeValue = resource.getString(R.string.C);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println(grade4);
                    }
                    else if (g4.equals("C-")) {
                        gradeValue = resource.getString(R.string.CMinus);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("D")) {
                        gradeValue = resource.getString(R.string.D);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("D+")) {
                        gradeValue = resource.getString(R.string.DPlus);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("D-")) {
                        gradeValue = resource.getString(R.string.DMinus);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("E")) {
                        gradeValue = resource.getString(R.string.E);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                    else if (g4.equals("F")) {
                        gradeValue = resource.getString(R.string.F);
                        grade4 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade4 is : "+grade4+ " " + gradeValue);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }

                try {
                    String g5 = Grade5.getText().toString();
                    if (g5.equals("A")){
                        gradeValue = resource.getString(R.string.A);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("A-")){
                        gradeValue = resource.getString(R.string.AMinus);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("B")){
                        gradeValue = resource.getString(R.string.B);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("B-")){
                        gradeValue = resource.getString(R.string.BMinus);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("C")) {
                        gradeValue = resource.getString(R.string.C);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("C-")) {
                        gradeValue = resource.getString(R.string.CMinus);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("D")) {
                        gradeValue = resource.getString(R.string.D);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("D+")) {
                        gradeValue = resource.getString(R.string.DPlus);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("D-")) {
                        gradeValue = resource.getString(R.string.DMinus);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("E")) {
                        gradeValue = resource.getString(R.string.E);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                    else if (g5.equals("F")) {
                        gradeValue = resource.getString(R.string.F);
                        grade5 = (Double.parseDouble(gradeValue) * credit);
                        System.out.println("Grade5 is : "+grade5+ " " + gradeValue);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }

                    computeGPA.setEnabled(true);
                    total_grade = grade1 + grade2 + grade3 + grade4 + grade5;
                    System.out.println(total_grade);

                    double gpa = total_grade / total_credit;
                    double gpaCheck = gpa;
                    System.out.println("GPA is :" +gpa);
                    String gpaPercent;
                    if (gpa <= 4.0 && gpa >=2.7){
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        linearLayout1.setBackgroundColor(Color.GREEN);
                        view.setBackgroundColor(Color.GREEN);
                    }
                    else if (gpa <= 2.3 && gpa >=1.0){
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                        linearLayout1.setBackgroundColor(Color.YELLOW);
                        view.setBackgroundColor(Color.YELLOW);
                    }
                    else if (gpa <= 0.0) {
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        linearLayout1.setBackgroundColor(Color.RED);
                        view.setBackgroundColor(Color.RED);
                    }
                    textView.setText("Your GPA is : " + gpa);
                    System.out.println(gpa);

                if (gpa >= 0) {
                        computeGPA.setText("Clear Form");
                    } else {
                        // do nothing
                    }
            }
            //EraseActivity(view);
        });
    }

    public void checkEmptyFields(){
        final String grade_one = Grade1.getText().toString();
        final String grade_two = Grade2.getText().toString();
        final String grade_three = Grade3.getText().toString();
        final String grade_four = Grade4.getText().toString();
        final String grade_five = Grade5.getText().toString();

        if (grade_one.isEmpty()) {
            Grade1.setError("Field cannot be empty");
        } else {
            Grade1.setError(null);
        }
        if (grade_two.isEmpty()) {
            Grade2.setError("Field cannot be empty");
        } else {
            Grade2.setError(null);
        }
        if (grade_three.isEmpty()) {
            Grade3.setError("Field cannot be empty");
        } else {
            Grade3.setError(null);
        }
        if (grade_four.isEmpty()) {
            Grade4.setError("Field cannot be empty");
        } else {
            Grade4.setError(null);
        }
        if (grade_five.isEmpty()) {
            Grade5.setError("Field cannot be empty");
        } else {
            Grade5.setError(null);
        }
    }
}
