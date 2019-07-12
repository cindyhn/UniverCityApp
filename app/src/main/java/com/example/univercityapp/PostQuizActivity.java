package com.example.univercityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class PostQuizActivity extends AppCompatActivity {

    //    public String recommendedMajor = " ";
    public TextView tvPostQuizText, tvPostQuizRecommendation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_quiz);




        tvPostQuizRecommendation = findViewById(R.id.tvPostQuizRecommendation);
        tvPostQuizText = findViewById(R.id.tvPostQuizText);

        int majorScores = Collections.max(Arrays.asList(Global.economicsScore, Global.financeScore, Global.marketingScore));

        System.out.println(majorScores);

        tvPostQuizRecommendation.setText("" + majorScores);

//        tvPostQuizText.setText();


    }
}

