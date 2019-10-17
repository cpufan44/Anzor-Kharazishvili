package com.anzor.quizapp;


import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class StorageManager {

    private static final String FILE_NAME = "result";

    private Context mContext;

    public StorageManager(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context is empty !");
        }

        this.mContext = context;

    }

    public void  write(String key, int value) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(key, value);

        editor.commit();

    }


    private SharedPreferences getSharedPreferences() {

        return mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }

    public int read(String key){



        return getSharedPreferences().getInt(key, 0 );
    }


}
