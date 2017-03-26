package com.example.gray.test001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu000, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.item001:
                Intent a = new Intent();
                a.setClass(MainActivity.this, Activity001.class);
                startActivity(a);
                break;
            case R.id.item002:
                Intent b = new Intent();
                b.setClass(MainActivity.this, Activity002.class);
                startActivity(b);
                break;
        }
        return true;
    }
}