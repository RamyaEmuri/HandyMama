package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.rd.PageIndicatorView;

import java.util.Timer;

public class OnBoarding extends AppCompatActivity {


    Timer timer;
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private SliderAdapter sliderAdapter;
    private PageIndicatorView pageIndicatorView;

    private final Handler handler = new Handler();
    private Runnable updateRunnable;
    private final long delayTime = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_on_boarding);



        viewPager = (ViewPager) findViewById(R.id.viewPagerOnboarding);
        pageIndicatorView = (PageIndicatorView) findViewById(R.id.pageIndicatorView);
        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);
        viewPager.addOnPageChangeListener(viewListener);

        pageIndicatorView.setViewPager(viewPager);

        updateRunnable = new Runnable() {
            @Override
            public void run() {
                int currentPosition = viewPager.getCurrentItem();
                if (currentPosition == ((SliderAdapter) sliderAdapter).getCount() - 1) {
                    viewPager.setCurrentItem(0, true);
                } else {
                    viewPager.setCurrentItem(currentPosition + 1, true);
                }
            }
        };

        TextView textView = findViewById(R.id.textViewSignIn);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnBoarding.this, HandyMamaSelectingScreen.class);
                startActivity(intent);
//SignUpScreen
            }
        });

        TextView textView1 = findViewById(R.id.textViewSkip);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnBoarding.this, HandyMamaSelectingScreen.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnBoarding.this, HandyMamaSelectingScreen.class);
                startActivity(intent);
//                finish();
            }
        });
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {
            if (state == ViewPager.SCROLL_STATE_IDLE) {
                handler.removeCallbacks(updateRunnable);
                handler.postDelayed(updateRunnable, delayTime);
            }else{
                handler.removeCallbacks(updateRunnable);
            }
        }
    };
    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(updateRunnable);
    }
    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(updateRunnable,delayTime);
    }
}
