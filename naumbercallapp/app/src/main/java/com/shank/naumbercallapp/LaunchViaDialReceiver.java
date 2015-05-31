package com.shank.naumbercallapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LaunchViaDialReceiver extends BroadcastReceiver {

    private static final String LAUNCHER_NUMBER = "123456";

    @Override
    public void onReceive(Context context, Intent intent) {
        String phoneNubmer = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        if (LAUNCHER_NUMBER.equals(phoneNubmer)) {
            setResultData(null);
            Intent appIntent = new Intent(context,MainActivity.class);
            appIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(appIntent);
        }

    }
}