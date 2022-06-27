package com.example.tp_exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.tp_exam.ui.login.LoginActivity;

public class SplashSceenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_sceen);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            // This method will be executed once the timer is over
            // Start your app main activity
                Intent i = new Intent(SplashSceenActivity.this,
                        LoginActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }


}