package com.example.gray.test001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by gray on 2017/3/26.
 */

public class Activity002 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity002);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuback, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int ClickedId = item.getItemId();
        if(ClickedId == R.id.backitem){
            Activity002.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}