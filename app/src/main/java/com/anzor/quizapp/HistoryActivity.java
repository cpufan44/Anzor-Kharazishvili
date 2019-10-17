package com.anzor.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.*;

import java.util.ArrayList;
import java.util.List;

import static com.anzor.quizapp.QuizActivity.mResults;

public class HistoryActivity extends AppCompatActivity{

    private ListView mHistorylist;



    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.activity_history);
        mHistorylist = findViewById(R.id.last_played_results);


        ArrayAdapter mAdap = new ArrayAdapter(this, R.layout.activity_history, mResults);

        mHistorylist.setAdapter(mAdap);






    }
}

