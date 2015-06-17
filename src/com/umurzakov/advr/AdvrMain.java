package com.umurzakov.advr;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class AdvrMain extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button) findViewById(R.id.button_start);
        button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlarmUtil.startAlarm(getApplicationContext());
                }
            });
    }
}
