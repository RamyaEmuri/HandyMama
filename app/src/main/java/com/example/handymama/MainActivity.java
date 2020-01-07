package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int SPLASh_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.view_images);
        ImageView splash = (ImageView) findViewById(R.id.imageView);
        splash.startAnimation(animation);

//        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash_screen);
//        TextView splash1 = (TextView) findViewById(R.id.textView);
//        splash.startAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, OnBoarding.class);
                startActivity(intent);
                finish();
            }
        }, SPLASh_TIME_OUT);
    }
}
