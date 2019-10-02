package com.anzor.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends QuizActivity {



    private TextView ress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);

        ress = findViewById(R.id.ScoreR);


        UpdateScore(mScore);

        Intent intent = getIntent();
        String Score =intent.getExtras().getString("score");

        ress.setText(Score);




     Toast.makeText(ResultActivity.this, "Your result is " + mScore, Toast.LENGTH_SHORT).show();










    }



}
