package com.anzor.quizapp;

public class QuizLibrary {

    private String mQuestions[] = {"რომელი არის ცხოველი ? ", "რომელი არის პლანეტა ?", "რომელი არის ოპერაციული სისტემა ? ", "რომელი საათია ? ", "კაცია ადამიანი ?!"};

    private String mAnswers[][] = {{"კატა", "გუგული", "წერო"}, {"მარსი", "მთვარე", "მზე"}, {"ოპერა", "ვინრარი", "სიმბიანი"}, {"4:20", "3:20", "0:00"}, {"კი", "არა", "მგონი"}};

    private String mCorrect[] = {"კატა", "მარსი", "სიმბიანი", "3:20", "მგონი"};


    public int getSize(){
        int a = mQuestions.length;
        return a;
    }

    public String getQuestion(int a){

        String question = mQuestions[a];

        return question;
    }
    public String getChoice1(int a){

        String choice0 = mAnswers[a][0];
        return  choice0;

    }
    public String getChoice2(int a){

        String choice1 = mAnswers[a][1];
        return  choice1;

    }
    public String getChoice3(int a){

        String choice2 = mAnswers[a][2];
        return  choice2;

    }

    public String getCorrectAnswer(int a){

        String answer = mCorrect[a];

        return answer;
    }








}
