package com.example.univercityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    public QuestionLibrary questionLibrary = new QuestionLibrary();


    public TextView tvQuizQuestion, tvQuizCount, tvQuizCounter;
    public Button btQuizAnswer1;
    public Button btQuizAnswer2;
    public Button btQuizAnswer3;
    public Button btQuizAnswer4;


    public String financeAnswer;
    public String businessEconomicsAnswer;
    public String marketingAnswer;
    public String accountingAnswer;
    public String businessLawAnswer;
    public String busStratAnswer;
    public String financialEconomicsAnswer;
    public String hrMgmtAnswer;
    public String intlBusinessAnswer;
    public String mgmtAnswer;
    public String realEstateAnswer;
    public String taxationAnswer;


    public int questionCounter = 1;

    public int questionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuizQuestion = findViewById(R.id.tvQuizQuestion);
        btQuizAnswer1 = findViewById(R.id.btQuizAnswer1);
        btQuizAnswer2 = findViewById(R.id.btQuizAnswer2);
        btQuizAnswer3 = findViewById(R.id.btQuizAnswer3);
        btQuizAnswer4 = findViewById(R.id.btQuizAnswer4);

       tvQuizCount = findViewById(R.id.tvQuizCount);
       tvQuizCounter = findViewById(R.id.tvQuizCounter);


        updateQuestion();



        btQuizAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btQuizAnswer1.getText() == financeAnswer) {
                    Global.financeScore = Global.financeScore + 1;
                    updateScore(Global.financeScore);

                }

                if(btQuizAnswer1.getText() == marketingAnswer){
                    Global.marketingScore = Global.marketingScore + 1;
                    updateScore(Global.marketingScore);

                }

                if(btQuizAnswer1.getText() == businessEconomicsAnswer) {
                    Global.businessEconomicsScore = Global.businessEconomicsScore + 1;
                    updateScore(Global.businessEconomicsScore);

                }

                if(btQuizAnswer1.getText() == accountingAnswer) {
                    Global.accountingScore = Global.accountingScore + 1;
                    updateScore(Global.accountingScore);

                }

                if(btQuizAnswer1.getText() == businessLawAnswer) {
                    Global.businessLawScore = Global.businessLawScore + 1;
                    updateScore(Global.businessLawScore);

                }

                if(btQuizAnswer1.getText() == busStratAnswer) {
                    Global.busStratScore = Global.busStratScore + 1;
                    updateScore(Global.busStratScore);

                }

                if(btQuizAnswer1.getText() == financialEconomicsAnswer) {
                    Global.financialEconomicsScore = Global.financialEconomicsScore + 1;
                    updateScore(Global.financialEconomicsScore);

                }

                if(btQuizAnswer1.getText() == hrMgmtAnswer) {
                    Global.hrMgmtScore = Global.hrMgmtScore + 1;
                    updateScore(Global.hrMgmtScore);

                }

                if(btQuizAnswer1.getText() == intlBusinessAnswer) {
                    Global.intlBusinessScore = Global.intlBusinessScore + 1;
                    updateScore(Global.intlBusinessScore);

                }

                if(btQuizAnswer1.getText() == mgmtAnswer) {
                    Global.mgmtScore = Global.mgmtScore + 1;
                    updateScore(Global.mgmtScore);

                }

                if(btQuizAnswer1.getText() == realEstateAnswer) {
                    Global.realEstateScore = Global.realEstateScore + 1;
                    updateScore(Global.realEstateScore);

                }

                if(btQuizAnswer1.getText() == taxationAnswer) {
                    Global.taxationScore = Global.taxationScore + 1;
                    updateScore(Global.taxationScore);

                }


                updateQuestion();
        //        tvQuizCount.setText(questionNumber);


            }



        });

        btQuizAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btQuizAnswer2.getText() == financeAnswer) {
                    Global.financeScore = Global.financeScore + 1;
                    updateScore(Global.financeScore);

                }

                if(btQuizAnswer2.getText() == marketingAnswer){
                    Global.marketingScore = Global.marketingScore + 1;
                    updateScore(Global.marketingScore);

                }

                if(btQuizAnswer2.getText() == businessEconomicsAnswer) {
                    Global.businessEconomicsScore = Global.businessEconomicsScore + 1;
                    updateScore(Global.businessEconomicsScore);

                }

                if(btQuizAnswer2.getText() == accountingAnswer) {
                    Global.accountingScore = Global.accountingScore + 1;
                    updateScore(Global.accountingScore);

                }

                if(btQuizAnswer2.getText() == businessLawAnswer) {
                    Global.businessLawScore = Global.businessLawScore + 1;
                    updateScore(Global.businessLawScore);

                }

                if(btQuizAnswer2.getText() == busStratAnswer) {
                    Global.busStratScore = Global.busStratScore + 1;
                    updateScore(Global.busStratScore);

                }

                if(btQuizAnswer2.getText() == financialEconomicsAnswer) {
                    Global.financialEconomicsScore = Global.financialEconomicsScore + 1;
                    updateScore(Global.financialEconomicsScore);

                }

                if(btQuizAnswer2.getText() == hrMgmtAnswer) {
                    Global.hrMgmtScore = Global.hrMgmtScore + 1;
                    updateScore(Global.hrMgmtScore);

                }

                if(btQuizAnswer2.getText() == intlBusinessAnswer) {
                    Global.intlBusinessScore = Global.intlBusinessScore + 1;
                    updateScore(Global.intlBusinessScore);

                }

                if(btQuizAnswer2.getText() == mgmtAnswer) {
                    Global.mgmtScore = Global.mgmtScore + 1;
                    updateScore(Global.mgmtScore);

                }

                if(btQuizAnswer2.getText() == realEstateAnswer) {
                    Global.realEstateScore = Global.realEstateScore + 1;
                    updateScore(Global.realEstateScore);

                }

                if(btQuizAnswer2.getText() == taxationAnswer) {
                    Global.taxationScore = Global.taxationScore + 1;
                    updateScore(Global.taxationScore);

                }

                updateQuestion();
         //       tvQuizCount.setText(questionNumber);


            }



        });

        btQuizAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btQuizAnswer3.getText() == financeAnswer) {
                    Global.financeScore = Global.financeScore + 1;
                    updateScore(Global.financeScore);

                }

                if(btQuizAnswer3.getText() == marketingAnswer){
                    Global.marketingScore = Global.marketingScore + 1;
                    updateScore(Global.marketingScore);

                }

                if(btQuizAnswer3.getText() == businessEconomicsAnswer) {
                    Global.businessEconomicsScore = Global.businessEconomicsScore + 1;
                    updateScore(Global.businessEconomicsScore);

                }

                if(btQuizAnswer3.getText() == accountingAnswer) {
                    Global.accountingScore = Global.accountingScore + 1;
                    updateScore(Global.accountingScore);

                }

                if(btQuizAnswer3.getText() == businessLawAnswer) {
                    Global.businessLawScore = Global.businessLawScore + 1;
                    updateScore(Global.businessLawScore);

                }

                if(btQuizAnswer3.getText() == busStratAnswer) {
                    Global.busStratScore = Global.busStratScore + 1;
                    updateScore(Global.busStratScore);

                }

                if(btQuizAnswer3.getText() == financialEconomicsAnswer) {
                    Global.financialEconomicsScore = Global.financialEconomicsScore + 1;
                    updateScore(Global.financialEconomicsScore);

                }

                if(btQuizAnswer3.getText() == hrMgmtAnswer) {
                    Global.hrMgmtScore = Global.hrMgmtScore + 1;
                    updateScore(Global.hrMgmtScore);

                }

                if(btQuizAnswer3.getText() == intlBusinessAnswer) {
                    Global.intlBusinessScore = Global.intlBusinessScore + 1;
                    updateScore(Global.intlBusinessScore);

                }

                if(btQuizAnswer3.getText() == mgmtAnswer) {
                    Global.mgmtScore = Global.mgmtScore + 1;
                    updateScore(Global.mgmtScore);

                }

                if(btQuizAnswer3.getText() == realEstateAnswer) {
                    Global.realEstateScore = Global.realEstateScore + 1;
                    updateScore(Global.realEstateScore);

                }

                if(btQuizAnswer3.getText() == taxationAnswer) {
                    Global.taxationScore = Global.taxationScore + 1;
                    updateScore(Global.taxationScore);

                }


                updateQuestion();
         //       tvQuizCount.setText(questionNumber);


            }



        });

        btQuizAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btQuizAnswer4.getText() == financeAnswer) {
                    Global.financeScore = Global.financeScore + 1;
                    updateScore(Global.financeScore);

                }

                if(btQuizAnswer4.getText() == marketingAnswer){
                    Global.marketingScore = Global.marketingScore + 1;
                    updateScore(Global.marketingScore);

                }

                if(btQuizAnswer4.getText() == businessEconomicsAnswer) {
                    Global.businessEconomicsScore = Global.businessEconomicsScore + 1;
                    updateScore(Global.businessEconomicsScore);

                }

                if(btQuizAnswer4.getText() == accountingAnswer) {
                    Global.accountingScore = Global.accountingScore + 1;
                    updateScore(Global.accountingScore);

                }

                if(btQuizAnswer4.getText() == businessLawAnswer) {
                    Global.businessLawScore = Global.businessLawScore + 1;
                    updateScore(Global.businessLawScore);

                }

                if(btQuizAnswer4.getText() == busStratAnswer) {
                    Global.busStratScore = Global.busStratScore + 1;
                    updateScore(Global.busStratScore);

                }

                if(btQuizAnswer4.getText() == financialEconomicsAnswer) {
                    Global.financialEconomicsScore = Global.financialEconomicsScore + 1;
                    updateScore(Global.financialEconomicsScore);

                }

                if(btQuizAnswer4.getText() == hrMgmtAnswer) {
                    Global.hrMgmtScore = Global.hrMgmtScore + 1;
                    updateScore(Global.hrMgmtScore);

                }

                if(btQuizAnswer4.getText() == intlBusinessAnswer) {
                    Global.intlBusinessScore = Global.intlBusinessScore + 1;
                    updateScore(Global.intlBusinessScore);

                }

                if(btQuizAnswer4.getText() == mgmtAnswer) {
                    Global.mgmtScore = Global.mgmtScore + 1;
                    updateScore(Global.mgmtScore);

                }

                if(btQuizAnswer4.getText() == realEstateAnswer) {
                    Global.realEstateScore = Global.realEstateScore + 1;
                    updateScore(Global.realEstateScore);

                }

                if(btQuizAnswer4.getText() == taxationAnswer) {
                    Global.taxationScore = Global.taxationScore + 1;
                    updateScore(Global.taxationScore);

                }

                updateQuestion();
            //    tvQuizCount.setText(questionNumber);


            }



        });

    }




    public void updateQuestion() {
        tvQuizCount.setText(Integer.toString(questionCounter));
        tvQuizQuestion.setText(questionLibrary.getQuestion(questionNumber));
        btQuizAnswer1.setText(questionLibrary.getChoice1(questionNumber));
        btQuizAnswer2.setText(questionLibrary.getChoice2(questionNumber));
        btQuizAnswer3.setText(questionLibrary.getChoice3(questionNumber));
        btQuizAnswer4.setText(questionLibrary.getChoice4(questionNumber));
        financeAnswer = questionLibrary.getFinanceAnswers(questionNumber);
        marketingAnswer = questionLibrary.getMarketingAnswers(questionNumber);
        businessEconomicsAnswer = questionLibrary.getEconomicsAnswers(questionNumber);
        accountingAnswer = questionLibrary.getAccountingAnswers(questionNumber);
       businessLawAnswer = questionLibrary.getBusLawAnswers(questionNumber);
       busStratAnswer = questionLibrary.getBusStratAnswers(questionNumber);
       financialEconomicsAnswer = questionLibrary.getFinancialEconomicsAnswers(questionNumber);
        hrMgmtAnswer = questionLibrary.getHRMgmtAnswers(questionNumber);
       intlBusinessAnswer = questionLibrary.getIntlBusinessAnswers(questionNumber);
       mgmtAnswer = questionLibrary.getMgmtAnswers(questionNumber);
       realEstateAnswer = questionLibrary.getRealEstateAnswers(questionNumber);
       taxationAnswer = questionLibrary.getTaxationAnswers(questionNumber);

        if(questionNumber < 7) {
            questionCounter++;
        }

        if(questionNumber == 7) {
            QuizActivity.this.finish();
            Intent myIntent = new Intent(getBaseContext(), PostQuizActivity.class);
            startActivity(myIntent);
        }



        questionNumber++;

       // tvQuizCount.setText(questionCounter);

    }

    public void updateScore(int point) {

    }

//    public void launchPostQuizScreen(View v) {
//        Intent myIntent = new Intent(getBaseContext(), PostQuizActivity.class);
//        startActivity(myIntent);
//    }

    public void launchHomeScreen(View v) {
        Intent myIntent = new Intent(getBaseContext(), HomeActivity.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}