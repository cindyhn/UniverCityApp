package com.example.univercityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AvatarProfilePage extends AppCompatActivity {

    TextView tvUsername;
    TextView tvDegree;
    TextView tvMajor;
    TextView tvProfilePageWam;
    TextView tvProfilePageUoc;
    TextView tvProfilePageGoalWam;

    private Boolean exit = false;

    public ImageView ivCorgi2, ivCorgiBone2, ivCorgiMedal2, ivCorgiGrad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_profile_page);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }


        ivCorgi2 = findViewById(R.id.ivCorgi2);
        ivCorgiBone2 = findViewById(R.id.ivCorgiBone2);
        ivCorgiMedal2 = findViewById(R.id.ivCorgiMedal2);
        ivCorgiGrad2 = findViewById(R.id.ivCorgiGrad2);


        ivCorgi2.setVisibility(View.INVISIBLE);
        ivCorgiBone2.setVisibility(View.INVISIBLE);
        ivCorgiMedal2.setVisibility(View.INVISIBLE);
        ivCorgiGrad2.setVisibility(View.INVISIBLE);


        if(Global.totalCourses <  8) {
            ivCorgi2.setVisibility(View.VISIBLE);
            ivCorgiBone2.setVisibility(View.INVISIBLE);
            ivCorgiMedal2.setVisibility(View.INVISIBLE);
            ivCorgiGrad2.setVisibility(View.INVISIBLE);
        }

        if(Global.totalCourses >= 8 && Global.totalCourses<16) {
            ivCorgi2.setVisibility(View.INVISIBLE);
            ivCorgiBone2.setVisibility(View.VISIBLE);
            ivCorgiMedal2.setVisibility(View.INVISIBLE);
            ivCorgiGrad2.setVisibility(View.INVISIBLE);
        }

        if(Global.totalCourses >=16 && Global.totalCourses <24) {
            ivCorgi2.setVisibility(View.INVISIBLE);
            ivCorgiBone2.setVisibility(View.INVISIBLE);
            ivCorgiMedal2.setVisibility(View.VISIBLE);
            ivCorgiGrad2.setVisibility(View.INVISIBLE);
        }

        if(Global.totalCourses >=24 && Global.totalCourses <32) {
            ivCorgi2.setVisibility(View.INVISIBLE);
            ivCorgiBone2.setVisibility(View.INVISIBLE);
            ivCorgiMedal2.setVisibility(View.INVISIBLE);
            ivCorgiGrad2.setVisibility(View.VISIBLE);
        }

        tvUsername = findViewById(R.id.tvUsername);
        tvDegree = findViewById(R.id.tvDegree);
        tvMajor = findViewById(R.id.tvMajor);
        tvProfilePageWam = findViewById(R.id.tvProfilePageWam);
        tvProfilePageUoc = findViewById(R.id.tvProfilePageUoC);
        tvProfilePageGoalWam = findViewById(R.id.tvProfilePageGoalWam);

        tvUsername.setText("Username: " + Global.user);
        tvDegree.setText("Degree: " + Global.degree);
        tvMajor.setText("Major: " + Global.major);
        tvProfilePageWam.setText("WAM: " + Global.previousWam);
        tvProfilePageUoc.setText("UOC: " + (Global.totalCourses * 6));
        tvProfilePageGoalWam.setText("Goal WAM: " + Global.goalWam);


    }

    public void launchHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
