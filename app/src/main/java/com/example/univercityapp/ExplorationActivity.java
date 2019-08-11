package com.example.univercityapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class ExplorationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration);

        setNotifBarTrans();

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        TextView tvExplorationMain = findViewById(R.id.tvExplorationMain);

        ImageButton btExplorationAccounting = findViewById(R.id.btExplorationAccounting);
        btExplorationAccounting.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationAccounting.class);
                startActivity(intent);
            }
        });

        ImageButton btExplorationBusinessEconomics = findViewById(R.id.btExplorationBusinessEconomics);
        btExplorationBusinessEconomics.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationEconomics.class);
                startActivity(intent);
            }
        });


        ImageButton btExplorationBusinessLaw = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationBusinessLaw.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationLaw.class);
                startActivity(intent);
            }
        });


        ImageButton btExplorationFinance = findViewById(R.id.btExplorationFinance);
        btExplorationFinance.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationFinance.class);
                startActivity(intent);
            }
        });


        ImageButton btExplorationIntlBusiness = findViewById(R.id.btExplorationIntlBusiness);
        btExplorationIntlBusiness.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationIntl.class);
                startActivity(intent);
            }
        });


        ImageButton btExplorationManagement = findViewById(R.id.btExplorationMgmt);
        btExplorationManagement.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationManagement.class);
                startActivity(intent);
            }
        });


        ImageButton btExplorationMarketing = findViewById(R.id.btExplorationMarketing);
        btExplorationMarketing.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationMarketing.class);
                startActivity(intent);
            }
        });

        ImageButton btExplorationInfs = findViewById(R.id.btExplorationInfs);
        btExplorationInfs.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplorationInfs.class);
                startActivity(intent);
            }
        });

    }

    public void onBackPressed() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    public void launchHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
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
