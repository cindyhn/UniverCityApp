package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void launchMyWamScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), MyWamActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void launchMajorMapsScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), MajorMapsActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void launchQuizScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), QuizActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void launchHelpScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HelpActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void launchExplorationScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), ExplorationActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
