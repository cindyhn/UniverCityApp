package com.example.univercityapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class ProgressionActivity extends AppCompatActivity {


    private ArrayList<Integer> week = new ArrayList<>();
    private ArrayList<Integer> date = new ArrayList<>();
    private ArrayList<String> month = new ArrayList<>();
    private ArrayList<String> lecture = new ArrayList<>();
    private ArrayList<String> lab = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progression);

        for (int i = 0; i < Offerings.getOfferings().size(); i++) {
            Offerings offerings = Offerings.getOfferings().get(i);
            week.add(offerings.getWeek());
            date.add(offerings.getDate());
            month.add(offerings.getMonth());
            lecture.add(offerings.getLecture());
            lab.add(offerings.getLab());

            RecyclerView recyclerView = findViewById(R.id.recycler_view);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(week, date, month, lecture, lab, this);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setLogo(R.drawable.logo);
//        getSupportActionBar().setDisplayUseLogoEnabled(true);
//    }
//
//    @Nullable
//    @Override
//    public ActionBar getSupportActionBar() {
//        return super.getSupportActionBar();
//    }
    }

    public void launchHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}