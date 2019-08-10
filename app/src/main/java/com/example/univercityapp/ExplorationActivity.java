package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ExplorationActivity extends AppCompatActivity {

    TextView tvExplorationMain;

    ImageButton btExplorationAccounting, btExplorationBusinessEconomics,
            btExplorationBusinessLaw, btExplorationBusStrat, btExplorationFinance,
            btExplorationFinancialEconomics, btExplorationHRMgmt, btExplorationIntlBusiness,
            btExplorationManagement, btExplorationMarketing, btExplorationRealEstate,
            btExplorationTaxation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration);

        btExplorationAccounting = findViewById(R.id.btExplorationAccounting);
        btExplorationBusinessEconomics = findViewById(R.id.btExplorationBusinessEconomics);
        btExplorationBusinessLaw = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationFinance = findViewById(R.id.btExplorationFinance);
        btExplorationIntlBusiness = findViewById(R.id.btExplorationIntlBusiness);
        btExplorationManagement = findViewById(R.id.btExplorationMgmt);
        btExplorationMarketing = findViewById(R.id.btExplorationMarketing);


        tvExplorationMain = findViewById(R.id.tvExplorationMain);




    }


    public void launchHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}
