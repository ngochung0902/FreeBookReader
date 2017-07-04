package com.example.hungn.fbr.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import com.example.hungn.fbr.R;

public class MyService extends Service {

    private MediaPlayer mediaPlayer;

    public MyService() {
    }


    @Override
    public IBinder onBind(Intent intent){
        return null;
    }


    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nhacnhe);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mediaPlayer.start();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        mediaPlayer.release();
        super.onDestroy();
    }

}
