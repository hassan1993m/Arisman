package com.hassanmoazeni.hello;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText username = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().length() == 11) {
                    Toast.makeText(getApplicationContext(),
                            "like", Toast.LENGTH_SHORT).show();
                }else if(username.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(),
                            "یه چی بزن", Toast.LENGTH_SHORT).show();
                }else { Toast.makeText(getApplicationContext(),
                        String.valueOf(username.length()) + " اشتباه " , Toast.LENGTH_SHORT).show();
                }

            }

        });


    }
}