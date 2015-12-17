package com.example.ben.fooscan;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ben on 11/5/2015.
 */
public class DataManager {
    private SharedPreferences sharedPreferences;
    private final static String PREFERENCES = "Preferences";
    private Activity host;

    public DataManager(Activity activity){
        host = activity;
        //sharedPreferences = activity.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
    }

    public boolean saveArray(String[] array, String arrayName) {
        SharedPreferences prefs = host.getSharedPreferences("preferencename", 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(arrayName +"_size", array.length);
        for(int i=0;i<array.length;i++)
            editor.putString(arrayName + "_" + i, array[i]);
        return editor.commit();
    }

    public String[] loadArray(String arrayName){
        SharedPreferences prefs = host.getSharedPreferences("preferencename", 0);
        int size = prefs.getInt(arrayName + "_size", 0);
        String array[] = new String[size];
        for (int i = 0; i < size; i++)
            array[i] = prefs.getString(arrayName + "_" + i, null);
        return array;
    }
}
