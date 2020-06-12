package com.example.myapplication;

import android.os.AsyncTask;

public class MyTzsk extends AsyncTask<String,Integer,String> {
    private MyInterface myInterface;

    public MyTzsk(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    @Override
    protected String doInBackground(String... strings) {
        if(strings[0] != null){
           myInterface.add(strings[0]);
        }
        return null;
    }
}
