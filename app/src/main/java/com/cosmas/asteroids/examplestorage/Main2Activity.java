package com.cosmas.asteroids.examplestorage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tMsg = findViewById(R.id.tvMsg);
    }

    public void previousActivity(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void showMessage(View v){
        SharedPreferences sp = getSharedPreferences("mydata", MODE_PRIVATE);
        String name = sp.getString("namekey","null");
        String section = sp.getString("seckey","null");
        String message = "Hello " + name + ". Your section is " + section;
        tMsg.setText(message);
    }
}
