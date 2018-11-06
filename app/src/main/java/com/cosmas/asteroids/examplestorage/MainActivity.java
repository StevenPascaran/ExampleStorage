package com.cosmas.asteroids.examplestorage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eName, eSection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName = findViewById(R.id.etName);
        eSection = findViewById(R.id.etSection);
    }

    public void nextActivity(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("mydata", MODE_PRIVATE);
        SharedPreferences.Editor writer = sp.edit();
        String name = eName.getText().toString();
        String section = eSection.getText().toString();
        writer.putString("namekey", name);
        writer.putString("seckey", section);
        writer.commit();

        Toast.makeText(this,"Data saved...",Toast.LENGTH_LONG).show();
    }
}
