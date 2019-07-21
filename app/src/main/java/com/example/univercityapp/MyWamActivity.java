package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyWamActivity extends AppCompatActivity {

    TextView tvWam;
    TextView tvWamGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wam);

        tvWam = findViewById(R.id.tvWam);
        tvWamGrade = findViewById(R.id.tvWamGrade);

        tvWam.setText(Global.previousWam);
        tvWamGrade.setText(Global.grade);
    }

    public void launchUseExistingWamScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), UseExistingWamActivity.class);
        startActivity(myIntent);
    }

    public void launchCreateNewCourseScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), CreateNewCourseActivity.class);
        startActivity(myIntent);
    }
}