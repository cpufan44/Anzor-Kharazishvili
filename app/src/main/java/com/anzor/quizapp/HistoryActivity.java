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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.anzor.quizapp.QuizActivity.mResults;

public class HistoryActivity extends AppCompatActivity {

    private ListView mHistorylist;


    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_history);

        mHistorylist =(ListView) findViewById(R.id.main_list_view);

        ArrayList<String> arayyyy = new ArrayList<>();



        ArrayAdapter mAdap = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, mResults);

        mHistorylist.setAdapter(mAdap);



    }


        }

