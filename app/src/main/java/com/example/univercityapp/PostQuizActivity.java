package com.example.univercityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
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

        //  ArrayList<String> majorList = new ArrayList<>();
        ArrayList<Integer> majorScores = new ArrayList();

        majorScores.add(Global.financeScore);
        majorScores.add(Global.businessEconomicsScore);
        majorScores.add(Global.marketingScore);

        ArrayList<String> recommendedMajor = new ArrayList<>();

        recommendedMajor.add("Finance");
        recommendedMajor.add("Economics");
        recommendedMajor.add("Marketing");


        int highestMajorScore = Collections.max(majorScores);
        int recommendedMajorIndex = majorScores.indexOf(highestMajorScore);

        System.out.println(recommendedMajorIndex);


        tvPostQuizRecommendation.setText(recommendedMajor.get(recommendedMajorIndex));



    }
}