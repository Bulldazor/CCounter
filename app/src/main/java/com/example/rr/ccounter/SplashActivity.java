package com.example.rr.ccounter;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.logging.Handler;

public class SplashActivity extends AppCompatActivity {
    ActionBar actionBar;
    public static int SplashTime=4000;//in mili second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        actionBar=getSupportActionBar();
        actionBar.hide();
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(in);
                Toast.makeText(SplashActivity.this, "App Starting", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashTime);//time out
    }
}
