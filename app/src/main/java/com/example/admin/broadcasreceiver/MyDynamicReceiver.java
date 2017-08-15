package com.example.admin.broadcasreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Admin on 8/15/2017.
 */

public class MyDynamicReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        intent.getStringExtra("send");
        Toast.makeText(context, "I am a dynamic " + intent.getStringExtra("send"), Toast.LENGTH_SHORT).show();

    }
}
