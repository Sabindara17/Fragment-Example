package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FragementInterface {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.tv);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.a, FragementOne.class, null).commit();
        }
    }

    @Override
    public void getDataFromFragement(String data) {
        txt.setText(data);

    }
}