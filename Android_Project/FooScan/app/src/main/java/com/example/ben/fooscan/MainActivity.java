package com.example.ben.fooscan;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
try {
    //((LinearLayout) findViewById(android.R.id.ll)).setBackgroundColor(Color.RED);
}catch (Exception e){Log.e("Dingid",e.getLocalizedMessage());}
    TabHost tHost = (TabHost) findViewById(android.R.id.tabhost);

    TabHost.TabSpec tab1 = tHost.newTabSpec("First Tab");
    TabHost.TabSpec tab2 = tHost.newTabSpec("Second Tab");

    tab1.setIndicator("Inventory");
    tab1.setContent(new Intent(this, Inventory.class));
    tab2.setIndicator("Recipes");
    tab2.setContent(new Intent(this, Recipe_Generator.class));

    tHost.addTab(tab1);
    tHost.addTab(tab2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
