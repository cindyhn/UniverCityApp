package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ExplorationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration);

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

        /*ImageButton btExplorationBusinessEconomics = findViewById(R.id.btExplorationBusinessEconomics);
        btExplorationBusinessEconomics.setOnClickListener(this);

        ImageButton btExplorationBusinessLaw = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationBusinessLaw.setOnClickListener(this);

        ImageButton btExplorationFinance = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationFinance.setOnClickListener(this);

        ImageButton btExplorationIntlBusiness = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationIntlBusiness.setOnClickListener(this);

        ImageButton btExplorationManagement = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationManagement.setOnClickListener(this);

        ImageButton btExplorationMarketing = findViewById(R.id.btExplorationBusinessLaw);
        btExplorationMarketing.setOnClickListener(this);*/

    }

}
