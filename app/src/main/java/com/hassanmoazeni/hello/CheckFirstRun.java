package com.hassanmoazeni.hello;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by HASSAN on 2018-11-11.
 */

public class CheckFirstRun {


    public static boolean getCheck_first_run(Context context) {

        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("first_run",true);
    }

    public static void setCheck_first_run(Context context,boolean check_first_run) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("first_run",check_first_run).apply();
    }
}
