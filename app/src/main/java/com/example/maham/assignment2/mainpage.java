package com.example.maham.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        if(getIntent().getExtras()!=null){
        String value = getIntent().getExtras().getString("uname");
        Toast.makeText(getApplicationContext(),"Welcome "+value,Toast.LENGTH_LONG).show();
    }}
}
