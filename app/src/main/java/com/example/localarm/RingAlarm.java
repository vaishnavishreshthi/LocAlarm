package com.example.localarm;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RingAlarm extends AppCompatActivity {
    private final static String default_notification_channel_id = "default";
    private Ringtone ringtoneSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ring_alarm);

    }



    public void off(View view){
        finish();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("hello", "onDestroy is called");
        ringtoneSound.stop();
    }
}
