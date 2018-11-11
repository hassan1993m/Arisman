package com.hassanmoazeni.hello;


import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;


/**
 * Created by HASSAN on 2018-11-10.
 */

public class Check_first_run extends Activity {



    private SharedPreferences mSharedPreferences;
    private boolean check_first_run ;

    public boolean getCheck_first_run() {
        return check_first_run;
    }

    public void setCheck_first_run(boolean check_first_run) {
        this.check_first_run = check_first_run;
    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mSharedPreferences = getSharedPreferences("com.hassanmoazeni.hello",MODE_PRIVATE);
        Check_first_run n = new Check_first_run();


       /*if (!mSharedPreferences.getBoolean("first_run",true)){*/
        n.setCheck_first_run(true);
        boolean num = n.getCheck_first_run();
    }

    @Override
    protected void onResume() {
        super.onResume();

           /*mSharedPreferences.edit().putBoolean("first_run",false);
       }else {
           check_first_run.setCheck_first_run(true);
       }*/


    }
}