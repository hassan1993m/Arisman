package com.hassanmoazeni.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by HASSAN on 2018-11-10.
 */

public class Login extends AppCompatActivity {

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
