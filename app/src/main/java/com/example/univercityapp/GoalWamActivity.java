package com.example.univercityapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GoalWamActivity extends AppCompatActivity {

    Button btAddCurrentSubject;

    ArrayList<Course> addArray = new ArrayList<>();

    EditText etGoal;
    EditText etCurrentSubjects;
    ListView listView;
    TextView tvAverageMarkRequired;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_wam);
        setNotifBarTrans();

        btAddCurrentSubject = findViewById(R.id.btAddCurrentSubject);
        etGoal = findViewById(R.id.etGoal);
        etCurrentSubjects = findViewById(R.id.etCurrentSubjects);
        listView = findViewById(R.id.listView);
        tvAverageMarkRequired = findViewById(R.id.tvAverageMarkRequired);

        btAddCurrentSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getInputCurrentSubject = etCurrentSubjects.getText().toString();

                etCurrentSubjects.getText().clear();


                if (addArray.contains(getInputCurrentSubject)) {
                    Toast.makeText(getBaseContext(), "Item Already Added To The Array", Toast.LENGTH_LONG).show();
                }
                else if (getInputCurrentSubject == null || getInputCurrentSubject.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "Input Field Is Empty", Toast.LENGTH_LONG).show();
                }
                else {

                    Global.goalWam = etGoal.getText().toString();
                    Global.currentSubjects = Global.currentSubjects + 1;

                    double markRequired = ((Double.parseDouble(Global.goalWam) * (Global.totalCourses + Global.currentSubjects)) - (Global.totalMarks))/(Global.currentSubjects);
                    int markRequiredPerSubject = (int) markRequired;

                    tvAverageMarkRequired.setText("" + markRequired);

                    addArray.add(new Course(getInputCurrentSubject, markRequiredPerSubject));

                    for (int i = 1; i < addArray.size(); i++) {
                        addArray.get(i-1).setMark(markRequiredPerSubject);
                    }

                    ArrayAdapter<Course> adapter = new ArrayAdapter<Course>(GoalWamActivity.this, R.layout.custom_list, addArray);
                    listView.setAdapter(adapter);

//                    for (int i = 0; i < addArray.size(); i++) {
////                        addArray.get(i).setMark(33);
////                        System.out.println(addArray.get(i).getName() + addArray.get(i).getMark());
////
////                    }



//                    addArray.get(0).setMark(markRequiredPerSubject);










//                    Global.totalMarks = Global.totalMarks + getInputMark;
//                    Global.totalCourses = Global.totalCourses + 1;
//                    double wam = Global.totalMarks/Global.totalCourses;
//                    Global.previousWam = Double.toString(wam);
//
//                    System.out.println(Global.totalMarks);
//                    System.out.println(Global.totalCourses);
//                    System.out.println(Global.previousWam);
//
//                    if (wam >= 85) {
//                        Global.grade = "HD";
//                    }
//                    else if (wam >= 75) {
//                        Global.grade = "D";
//                    }
//                    else if (wam >= 65) {
//                        Global.grade = "C";
//                    }
//                    else {
//                        Global.grade = "P";
//                    }

//                    for (int i = 0; i < addArray.size(); i++) {
//                        System.out.println(addArray.get(i));
//                        ArrayAdapter<String> adapter = new ArrayAdapter<Course>(CreateNewCourseActivity.this, android.R.layout.simple_list_item_1, courses);
//                        listView.setAdapter(adapter);
//                    }


                }
            }
        });

    }

    public void launchMyWamScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), MyWamActivity.class);
        startActivity(myIntent);
    }

    private void setNotifBarTrans() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
}
