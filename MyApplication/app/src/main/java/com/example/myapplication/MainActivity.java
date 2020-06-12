package com.example.myapplication;


import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MyInterface{
    Button imger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imger = (Button)findViewById(R.id.imger);
        MyTzsk myTzsk = new MyTzsk(this);
        myTzsk.execute("再见！告辞");
    }

    @Override
    public String add(String namer) {
        Log.d("zhangrui","namer="+namer);
        imger.setText(namer);
        return null;
    }
}