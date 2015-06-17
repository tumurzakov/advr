package com.umurzakov.advr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OnAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        WakefulIntentService.acquireStaticLock(context);
    
        // if (service inactive) {
        context.startService(new Intent(context, AppService.class));
        // }
    }
}
