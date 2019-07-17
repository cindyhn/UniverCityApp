package com.example.univercityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WamCalculatorActivity extends AppCompatActivity {

    TextView tvWam;
    TextView tvWamGrade;
    EditText etPreviousWam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wam_calculator);

        tvWam = findViewById(R.id.tvWam);
        tvWamGrade = findViewById(R.id.tvWamGrade);
        etPreviousWam = findViewById(R.id.etPreviousWam);

        Button btAddWam = (Button) findViewById(R.id.btAddWam);

        btAddWam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String previousWam = etPreviousWam.getText().toString();
                tvWam.setText(previousWam);

                int wam = Integer.parseInt(previousWam);
                String grade;

                if (wam >= 85) {
                    grade = "HD";
                }
                else if (wam >= 75) {
                    grade = "D";
                }
                else if (wam >= 65) {
                    grade = "C";
                }
                else {
                    grade = "P";
                }

                System.out.println(grade);
                tvWamGrade.setText(grade);
            }
        });


    }
}
