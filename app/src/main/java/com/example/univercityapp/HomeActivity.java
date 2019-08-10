package com.example.univercityapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
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

    public void launchProgressionScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), ProgressionActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish();
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }

}
