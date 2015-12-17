package com.example.ben.fooscan;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Inventory extends AppCompatActivity {

    private DataManager mainManager;
    private final String savedInventoryIdenifier = "food_key_0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        //RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.inventory_layout);
        //relativeLayout.setBackgroundColor(Color.BLUE);
/*
        mainManager = new DataManager(this);
        String arr[] = new String[10];
        arr[0] = "Bacon";
        arr[1] = "Eggs";
        arr[2] = "Milk";
        arr[3] = "Sausages";
        arr[4] = "Gravy";
        arr[5] = "Chicken McMuffins";
        arr[6] = "Big Macs";
        arr[7] = "A live chicken";
        arr[8] = "A human foot";
        arr[9] = "Pickles";
        mainManager.saveArray(arr, savedInventoryIdenifier);
    */
/*
        int i = 0;
        for (String str : mainManager.loadArray(savedInventoryIdenifier)) {
            try {
                TextView tv = new TextView(this);
                tv.setText(str);
                tv.setWidth(500);
                tv.setHeight(40 * i);
                relativeLayout.addView(tv);
                i++;
            }catch (Exception e){
                Log.e("DINGID",e.getLocalizedMessage());
            }
        }*/

    }
}
