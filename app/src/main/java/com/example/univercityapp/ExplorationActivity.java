package com.example.univercityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ExplorationActivity extends AppCompatActivity {

    TextView tvExplorationMain;

    Button btExplorationAccounting, btExplorationBusinessEconomics,
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
        btExplorationBusStrat = findViewById(R.id.btExplorationBusStrat);
        btExplorationFinance = findViewById(R.id.btExplorationFinance);
        btExplorationFinancialEconomics = findViewById(R.id.btExplorationFinancialEconomics);
        btExplorationHRMgmt = findViewById(R.id.btExplorationHRMgmt);
        btExplorationIntlBusiness = findViewById(R.id.btExplorationIntlBusiness);
        btExplorationManagement = findViewById(R.id.btExplorationMgmt);
        btExplorationMarketing = findViewById(R.id.btExplorationMarketing);
        btExplorationRealEstate = findViewById(R.id.btExplorationRealEstate);
        btExplorationTaxation = findViewById(R.id.btExplorationTaxation);

        tvExplorationMain = findViewById(R.id.tvExplorationMain);




    }
}
