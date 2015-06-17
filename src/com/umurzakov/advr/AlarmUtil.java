package com.umurzakov.advr;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.SystemClock;
import android.content.Context;
import android.content.Intent;

public class AlarmUtil {
    private static final int PERIOD=10000;  // 10 sec

    public static void startAlarm(Context context) {
        AlarmManager mgr=(AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent i=new Intent(context, OnAlarmReceiver.class);
        PendingIntent pi=PendingIntent.getBroadcast(context, 0, i, 0);
    
        mgr.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                         SystemClock.elapsedRealtime()+PERIOD,
                         PERIOD,
                         pi);
    }
}
