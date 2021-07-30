package com.example.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver
{
    TextView textView;

    BatteryReceiver(TextView textView)
    {
        this.textView= textView;
    }

    @Override
    public void onReceive(Context context, Intent intent)
    {
        int percentage = intent .getIntExtra("level",0);

        if(percentage!=0 && percentage < 20)
        {
            textView.setText("Your Mobile battery have "+percentage+ "% Charge. Please connect to the Charger.");
        }
        else
        {
            if (percentage!=0)
            {
                textView.setText("You Mobile battery have "+percentage+ "% Charge.");
            }
        }

    }
}
