package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UseExistingWamActivity extends AppCompatActivity {


    EditText etPreviousWam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_existing_wam);


        etPreviousWam = findViewById(R.id.etPreviousWam);

        Button btAddWam = (Button) findViewById(R.id.btAddWam);

        btAddWam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Global.previousWam = etPreviousWam.getText().toString();

                double wam = Double.parseDouble(Global.previousWam);

                if (wam >= 85) {
                    Global.grade = "HD";
                }
                else if (wam >= 75) {
                    Global.grade = "D";
                }
                else if (wam >= 65) {
                    Global.grade = "C";
                }
                else {
                    Global.grade = "P";
                }

                System.out.println(wam);
                System.out.println(Global.grade);


                Intent myIntent = new Intent(getBaseContext(), MyWamActivity.class);
                startActivity(myIntent);
            }
        });


    }
}
