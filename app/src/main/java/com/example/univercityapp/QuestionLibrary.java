package com.example.univercityapp;

public class QuestionLibrary {

    public String [] questions = {
            "Which of the following do you most identify as?",
            "Which of these industries would you like to learn more about?",
            "What is your biggest hobby?",
            "How would you describe your working style?",
            "In a career, you are most interested in what?",
            "When making decisions, what crosses your mind?",
            "What appeals to you most from the following?",
           "What do you like in your work day?"



    };

    public String [] [] choices = {
            {"people person", "analytical", "leader", "creative"},
            {"banking", "real estate", "economics", "content creation"},
            {"travelling", "team sports", "chess", "monopoly"},
            {"customer focused", "detail-oriented", "fast-paced", "innovative"},
            {"keeping up with trends in an exciting market", "setting the teams direction", "being able to apply your knowledge across multiple  markets and industries", "self-employment"},
            {"best outcome for yourself", "reviewing and assessing all available information", "the needs of others affected", "researching and analysing a range of information"},
            {"numbers", "theory", "real-world application", "design"},
            {"routine", "excitement", "different environments", "No preference"}


    };


    public String financeAnswers [] = {"analytical", "banking", "placeholder", "detail-oriented", "keeping up with trends in an exciting market", "reviewing and assessing all available information", "numbers", "routine"};
    public String businessEconomicsAnswers[] = {"analytical", "economics", "placeholder", "customer focused", "placeholder", "best outcome for yourself", "numbers", "routine"};
    public String marketingAnswers [] = {"creative", "content creation", "placeholder", "innovative", "being able to apply your knowledge across multiple  markets and industries", "placeholder", "design", "excitement"};
    public String accountingAnswers [] = {"analytical", "placeholder", "team sports", "detail-oriented", "self-employment", "reviewing and assessing all available information", "numbers", "routine"};
    public String busLawAnswers [] = {"placeholder", "placeholder", "placeholder", "placeholder", "placeholder", "the needs of others affected", "theory", "routine"};
    public String busStratAnswers [] = {"placeholder", "economics", "chess", "placeholder", "being able to apply your knowledge across multiple  markets and industries", "best outcome for yourself", "placeholder", "placeholder"};
    public String financialEconomicsAnswers [] = {"placeholder", "economics", "placeholder", "placeholder", "placeholder", "best outcome for yourself", "placeholder", "placeholder"};
    public String hrMgmtAnswers [] = {"people person", "placeholder", "placeholder", "placeholder", "setting the teams direction", "the needs of others affected", "real-world application", "excitement"};
    public String intlBusinessAnswers [] = {"placeholder", "placeholder", "travelling", "fast-paced", "being able to apply your knowledge across multiple  markets and industries", "placeholder", "placeholder", "different environments"};
    public String mgmtAnswers [] = {"leader", "placeholder", "placeholder", "fast-paced", "setting the teams direction", "the needs of others affected", "real-world application", "excitement"};
    public String realEstateAnswers [] = {"people person", "real estate", "monopoly", "placeholder", "keeping up with trends in an exciting market", "researching and analysing a range of information", "placeholder", "placeholder"};
    public String taxationAnswers [] = {"placeholder", "placeholder", "monopoly", "placeholder", "placeholder", "researching and analysing a range of information", "placeholder", "placeholder"};



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
        String answer = businessEconomicsAnswers[a];
        return answer;
    }

    public String getAccountingAnswers(int a) {
        String answer = accountingAnswers[a];
        return answer;
    }

    public String getMarketingAnswers(int a) {
        String answer = marketingAnswers[a];
        return answer;
    }

    public String getBusLawAnswers(int a) {
        String answer = busLawAnswers[a];
        return answer;
    }

    public String getBusStratAnswers(int a) {
        String answer = busStratAnswers[a];
        return answer;
    }

    public String getFinancialEconomicsAnswers(int a) {
        String answer = financialEconomicsAnswers[a];
        return answer;
    }

    public String getHRMgmtAnswers(int a) {
        String answer = hrMgmtAnswers[a];
        return answer;
    }

    public String getIntlBusinessAnswers(int a) {
        String answer = intlBusinessAnswers[a];
        return answer;
    }

    public String getMgmtAnswers(int a) {
        String answer = mgmtAnswers[a];
        return answer;
    }

    public String getRealEstateAnswers(int a) {
        String answer = realEstateAnswers[a];
        return answer;
    }

    public String getTaxationAnswers(int a) {
        String answer = taxationAnswers[a];
        return answer;
    }

}