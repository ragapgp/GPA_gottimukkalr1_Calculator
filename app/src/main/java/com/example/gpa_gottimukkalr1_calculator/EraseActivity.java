package com.example.gpa_gottimukkalr1_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EraseActivity extends AppCompatActivity {
    public Button erase;
    double counter = 0, total_credit = 15, credit = 3, grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, total_grade = 0;    private EditText Grade1, Grade2, Grade3, Grade4, Grade5;
    //private EditText Grade1, Grade2, Grade3, Grade4, Grade5;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erase);

        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EX);

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                erase.setText("Compute GPA");
                counter = 0;
                total_credit = 15;
                credit = 0;
                grade1 = 0;
                grade2 = 0;
                grade3 = 0;
                grade4 = 0;
                grade5 = 0;
                total_grade = 0;
                Grade1.setText("");
                Grade2.setText("");
                Grade3.setText("");
                Grade4.setText("");
                Grade5.setText("");
                textView.setText("");
                Toast.makeText(getApplicationContext(), "Clearing"+total_grade, Toast.LENGTH_LONG).show();
            }
        });
    }
}