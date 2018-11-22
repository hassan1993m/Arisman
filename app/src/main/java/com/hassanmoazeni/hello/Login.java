package com.hassanmoazeni.hello;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rilixtech.CountryCodePicker;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = findViewById(R.id.editText);
        final Button button = findViewById(R.id.button);
        CountryCodePicker ccp = findViewById(R.id.ccp);
        ccp.registerPhoneNumberTextView(username);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String pNum = username.getText().toString();
                String country_code = ccp.getSelectedCountryCodeWithPlus();

                if (!pNum.isEmpty()){
                    if (IsNumeric(pNum) && pNum.length() == 10){
                        ccp.setFullNumber(country_code + pNum);
                        pNum = ccp.getFullNumberWithPlus();
                        Intent i =new Intent(Login.this, Signup.class);
                        i.putExtra("phone_number", pNum);
                        startActivity(i);
                    }else if (IsNumeric(pNum) && pNum.length() == 11 && pNum.charAt(0) == '0'){
                        pNum = pNum.substring(1);
                        ccp.setFullNumber(country_code + pNum);
                        pNum = ccp.getFullNumberWithPlus();
                        Intent i =new Intent(Login.this, Signup.class);
                        i.putExtra("phone_number", pNum);
                        startActivity(i);
                    }else {
                        Toast.makeText(getApplicationContext(),
                                "عبارت درست وارد کنید", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(),
                            "یه چی بزن", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    public Boolean IsNumeric(String str) {

        if (str == null)
            return false;
        char[] data = str.toCharArray();
        if (data.length <= 0)
            return false;
        int index = 0;
        if (data[0] == '-' && data.length > 1)
            index = 1;
        for (; index < data.length; index++) {
            if (data[index] < '0' || data[index] > '9') // Character.isDigit() can go here too.
                return false;
        }
        return true;
    }
}


