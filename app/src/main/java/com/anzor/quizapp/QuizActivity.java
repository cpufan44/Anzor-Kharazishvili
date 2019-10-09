package com.anzor.quizapp;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {


    protected TextView mQuestionView;
    protected TextView mLastReslt;
    protected TextView mLastReslttxt;
    protected TextView mNever;
    protected Button mChoice0;
    protected Button mChoice1;
    protected Button mChoice2;
    protected TextView mScoreView;
    protected Button mNext;
    protected Button mResult;
    String A;



    protected String mAnswer;
    private static String USER_RESULT = "result";
    protected int mQusetionNumber = 0;
    protected  int mScore = -1;
    private SharedPreferenceManager mSharedPreferenceManager;


    protected QuizLibrary mQuestionsLibrary = new QuizLibrary();
    int size = mQuestionsLibrary.getSize();

    protected int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mQuestionView = findViewById(R.id.Qstn);
        mChoice0 = findViewById(R.id.btn_1);
        mChoice1 = findViewById(R.id.btn_2);
        mChoice2 = findViewById(R.id.btn_3);
        mScoreView = findViewById(R.id.Score);
        mNext = findViewById(R.id.next_btn);
        mResult = findViewById(R.id.reslt);
        mLastReslt = findViewById(R.id.last_result);
        mLastReslttxt = findViewById(R.id.last_rslt);
        mNever = findViewById(R.id.not_done);

        mSharedPreferenceManager = new SharedPreferenceManager(this);





        if( mSharedPreferenceManager.read(QuizActivity.USER_RESULT) < 0) {

            mLastReslt.setVisibility(View.INVISIBLE);
            mLastReslttxt.setVisibility(View.INVISIBLE);




        }
        else
        {
            mNever.setVisibility(View.INVISIBLE);


        }



        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateQuestion();
            }
        });




        UpdateQuestion();
        mChoice0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mChoice0.getText() == mAnswer) {


                    if(mScore == -1)
                    {mScore = 0;
                    mScore++;}
                    else
                    mScore++;



                    mChoice0.setBackgroundColor(getResources().getColor(R.color.green));
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();


                    UpdateScore(mScore);


                } else {
                    if(mScore == -1)
                        mScore = 0;

                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    mChoice0.setBackgroundColor(getResources().getColor(R.color.red));


                }


            }
        });
        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mChoice1.getText() == mAnswer) {

                    if(mScore == -1)
                    {mScore = 0;
                        mScore++;}
                    else
                    mScore++;

                    mChoice1.setBackgroundColor(getResources().getColor(R.color.green));


                    UpdateScore(mScore);

                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    mChoice1.setBackgroundColor(getResources().getColor(R.color.red));
                    if(mScore == -1)
                        mScore = 0;



                }

            }
        });
        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mChoice2.getText() == mAnswer) {

                    if(mScore == -1)
                    {mScore = 0;
                    mScore++;}

                    else

                    mScore++;

                    mChoice2.setBackgroundColor(getResources().getColor(R.color.green));


                    UpdateScore(mScore);
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    mChoice2.setBackgroundColor(getResources().getColor(R.color.red));
                    if(mScore == -1)
                    mScore = 0;



                }


            }


        });
        mResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(QuizActivity.this, ResultActivity.class);

                String score = mScoreView.getText().toString();

                intent.putExtra("score", score);
                mSharedPreferenceManager.write(USER_RESULT, mScore);






                startActivity(intent);


            }
        });


    }


    public void UpdateQuestion() {
        if (mQusetionNumber == size) {


           String A = mScoreView.getText().toString();

            return;
        }
        mQuestionView.setText(mQuestionsLibrary.getQuestion(mQusetionNumber));
        mChoice0.setText(mQuestionsLibrary.getChoice1(mQusetionNumber));
        mChoice1.setText(mQuestionsLibrary.getChoice2(mQusetionNumber));
        mChoice2.setText(mQuestionsLibrary.getChoice3(mQusetionNumber));

        mChoice0.setBackgroundColor(getResources().getColor(R.color.white));
        mChoice1.setBackgroundColor(getResources().getColor(R.color.white));
        mChoice2.setBackgroundColor(getResources().getColor(R.color.white));

        mLastReslt.setText(String.valueOf(mSharedPreferenceManager.read(QuizActivity.USER_RESULT)));


        mAnswer = mQuestionsLibrary.getCorrectAnswer(mQusetionNumber);


        mQusetionNumber++;




    }


    protected void UpdateScore(int point) {




        mScoreView.setText("" + String.valueOf(mScore));




    }


}
