package com.hassanmoazeni.hello;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Field;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                Toast.makeText(getApplicationContext(),
                String.valueOf( ) + "25سلام", Toast.LENGTH_SHORT).show();

        }



}