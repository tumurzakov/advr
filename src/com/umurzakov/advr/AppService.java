package com.umurzakov.advr;

import android.content.Intent;
import android.util.Log;

public class AppService extends WakefulIntentService {
    public AppService() {
        super("AppService");
    }

    @Override
    protected void doWakefulWork(Intent intent) {
    
        try {
            // start socket server
        }
        catch (Exception e) {
            Log.e("AppService", "Exception appending to log file", e);
        }
    }
}
