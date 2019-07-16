package com.example.univercityapp;

public class QuestionLibrary {

    public String [] questions = {
            "Which of the following do you most identify as?",
            "Which of these industries would you like to learn more about?",
            "What is your biggest hobby?",
            "How would you describe your working style?",
            "In a career, you are most interested in what?",
            "When making decisions, what crosses your mind?",
            "Theoretical concepts or number crunching?",
            "Regular work routine or unpredictable work day?",
            "Well done! Click below proceed"


    };

    public String [] [] choices = {
            {"people person", "analytical", "leader", "creative"},
            {"banking", "real estate", "economics", "content creation"},
            {"travelling", "team sports", "chess", "monopoly"},
            {"customer focused", "detail-oriented", "fast-paced", "innovative"},
            {"keeping up with trends in an exciting market", "setting the teams direction", "being able to apply your knowledge across multiple  markets and industries", "self-employment"},
            {"best outcome for yourself", "reviewing and assessing all available information", "the needs of others affected", "researching and analysing a range of information"},
            {"numbers", "theory", "placeholder", "placeholder"},
            {"routine", "excitement", "placeholder", "placeholder"},
            {"1","2","3","4"}


    };


    public String financeAnswers [] = {"analytical","two","dos"};
    public String economicsAnswers [] = {"analytical", "economics", "tres"};
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