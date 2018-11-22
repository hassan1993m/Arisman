package com.hassanmoazeni.hello;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Field;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(CheckFirstRun.getCheck_first_run(this)){

            startActivity(new Intent(MainActivity.this, Login.class));

            Toast.makeText(getApplicationContext(),
                    "25سلام", Toast.LENGTH_SHORT).show();

            //CheckFirstRun.setCheck_first_run(this,false);
        }


        }



}