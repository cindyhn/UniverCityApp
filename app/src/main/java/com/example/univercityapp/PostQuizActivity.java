package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;

public class PostQuizActivity extends AppCompatActivity {

    //    public String recommendedMajor = " ";
    public TextView tvPostQuizText, tvPostQuizRecommendation;

    TextView mTextViewLearnMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_quiz);

        mTextViewLearnMore = (TextView)findViewById(R.id.textview_learnmore);
        mTextViewLearnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent learnMoreIntent = new Intent(PostQuizActivity.this,ExplorationActivity.class);
                startActivity(learnMoreIntent);
            }
        });


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

    public void launchHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}