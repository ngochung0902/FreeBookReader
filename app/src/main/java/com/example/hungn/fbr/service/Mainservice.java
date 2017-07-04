package com.example.hungn.fbr.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hungn.fbr.R;

public class Mainservice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_service);
    }

    public void playSong(View view)  {
        Intent myIntent = new Intent(Mainservice.this, MyService.class);
        this.startService(myIntent);
    }

    public void stopSong(View view)  {
        Intent myIntent = new Intent(Mainservice.this, MyService.class);
        this.stopService(myIntent);
    }
}
