package com.hassanmoazeni.hello;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static java.lang.String.valueOf;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button button = findViewById(R.id.button3);
        EditText editText = findViewById(R.id.editText2);
        TextView textView = findViewById(R.id.textView2);

        String phone = getIntent().getStringExtra("phone_number");

        // send sms to "phone" number.

        String note = "عزیز دلم کد تأیید برای شماره" + phone + "  ارسال شد ." ;
        textView.setText(note);
       // Toast.makeText(getApplicationContext(), phone, Toast.LENGTH_SHORT).show();


    }
}
