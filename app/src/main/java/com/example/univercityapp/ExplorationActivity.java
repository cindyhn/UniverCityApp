package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;

public class ExplorationActivity extends AppCompatActivity implements View.OnClickListener{

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

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        btExplorationAccounting = findViewById(R.id.btExplorationAccounting);
        btExplorationBusinessEconomics = findViewById(R.id.btExplorationBusinessEconomics);
        btExplorationBusinessLaw = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationFinance = findViewById(R.id.btExplorationFinance);
        btExplorationIntlBusiness = findViewById(R.id.btExplorationIntlBusiness);
        btExplorationManagement = findViewById(R.id.btExplorationMgmt);
        btExplorationMarketing = findViewById(R.id.btExplorationMarketing);


        tvExplorationMain = findViewById(R.id.tvExplorationMain);

        btExplorationAccounting.setOnClickListener(this);
    }

        @Override
        public void onClick(View view) {

            Intent intent = null;

            switch (view.getId()) {
                case R.id.btExplorationAccounting: intent = new Intent(getApplicationContext(), ExplorationAccounting.class);
                    break;

                default: break;
            }

            if (intent != null){
                try {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);

                } catch (Exception e){
                }

            }
        }


}

