package com.example.univercityapp;

public class QuestionLibrary {

    public String [] questions = {
            "people see me as",
            "placeholder question 2",
            "placeholder question 3",
            "placeholder question 4",
            "placeholder question 5",
            "placeholder question 6",
            "placeholder question 7",
            "placeholder question 8",
            "Click Finish page"


    };

    public String [] [] choices = {
            {"creative", "analytical", "authoritative", "logical"},
            {"one", "two", "three", "four"},
            {"uno", "dos", "tres", "quattro"},
            {"un", "deux", "trois", "quatre"},
            {"satu", "dua", "tiga", "empat"},
            {"okkati", "rendu", "murru", "nallu"},
            {"onnu", "rende", "munne", "nalle"},
            {"eek", "do", "deen", "jar"},



    };

    public String financeAnswers [] = {"analytical","two","dos"};
    public String economicsAnswers [] = {"analytical", "three", "tres"};
    public String marketingAnswers [] = {"creative", "one", "uno"};



    public String getQuestion(int a) {
        String question = questions[a];

        return question;

    }

    public String getChoice1(int a) {
        String choice0 = choices[a] [0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = choices[a] [1];
        return choice1;
    }


    public String getChoice3(int a) {
        String choice2 = choices[a] [2];
        return choice2;
    }


    public String getChoice4(int a) {
        String choice3 = choices[a] [3];
        return choice3;
    }

    public String getFinanceAnswers(int a) {
        String answer = financeAnswers[a];
        return answer;
    }

    public String getEconomicsAnswers(int a) {
        String answer = economicsAnswers[a];
        return answer;
    }

    public String getMarketingAnswers(int a) {
        String answer = marketingAnswers[a];
        return answer;
    }

}