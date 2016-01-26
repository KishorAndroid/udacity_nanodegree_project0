package com.appdevelopkar.project0.udacityproject0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    //Handle onClick events
    public void project1(View view){
        Toast.makeText(this, "This button will launch Spotify Streamer", Toast.LENGTH_SHORT).show();
    }
    public void project2(View view){
        Toast.makeText(this, "This button will launch Football Scores App", Toast.LENGTH_SHORT).show();
    }
    public void project3(View view){
        Toast.makeText(this, "This button will launch Library App", Toast.LENGTH_SHORT).show();
    }
    public void project4(View view){
        Toast.makeText(this, "This button will Build It Bigger", Toast.LENGTH_SHORT).show();
    }
    public void project5(View view){
        Toast.makeText(this, "This button will launch XYZ Reader", Toast.LENGTH_SHORT).show();
    }
    public void project6(View view){
        Toast.makeText(this, "This button will launch My Capstone Project", Toast.LENGTH_SHORT).show();
    }
}
