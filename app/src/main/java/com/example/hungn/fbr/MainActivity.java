package com.example.hungn.fbr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imgbt_tv;
    ImageButton imgbt_mtv;
    ImageButton imgbt_htb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------------------------------------------------------------------------------------------
        imgbt_tv = (ImageButton) this.findViewById(R.id.imgbt_tv);
        imgbt_tv.setOnClickListener(this);

        imgbt_mtv = (ImageButton) this.findViewById(R.id.imgbt_mtv);
        imgbt_mtv.setOnClickListener(this);

        imgbt_htb = (ImageButton) this.findViewById(R.id.imgbt_htb);
        imgbt_htb.setOnClickListener(this);
        //------------------------------------------------------------------------------------------
    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.imgbt_tv:
                Intent intent = new Intent(this, Main_tv.class);
                startActivity(intent);
        }
        switch (v.getId())
        {
            case R.id.imgbt_mtv:
                Intent intent1 = new Intent(this,Main_mtv.class);
                startActivity(intent1);
        }
        switch (v.getId())
        {
            case R.id.imgbt_htb:
                Intent intent2 = new Intent(this,Main_htb.class);
                startActivity(intent2);
        }
        }
    }


