package com.anzor.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



import androidx.annotation.Nullable;

public class QuizStart extends QuizActivity  {

    private Button mStart;
    private Button mHistory;
    private QuizActivity A = new QuizActivity();




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_first);
       mStart = findViewById(R.id.start_btn);
       mHistory = findViewById(R.id.history_channel);

       mStart.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(QuizStart.this, QuizActivity.class);

               startActivity(intent);

           }
       });

       mHistory.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent1 = new Intent(QuizStart.this, HistoryActivity.class);

               startActivity(intent1);

           }
       });



    }









}
