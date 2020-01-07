package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookingService extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "TXT";
    public static final String EXTRA_POSTER = "IMG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_service);

        TextView textView = findViewById(R.id.textViewTitle);

        TextView textView1 = findViewById(R.id.textHeading);

        String title = getIntent().getStringExtra(EXTRA_MESSAGE);
        Integer poster = getIntent().getIntExtra(EXTRA_POSTER, 0);
        textView.setText(title);
        String text = title+" "+ getString(R.string.str_features);
        textView1.setText(text);
        loadBackdrop(poster);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookingService.this, CleaningService.class);
                startActivity(intent);
            }
        });


//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_animation);
//        ImageView imageView = findViewById(R.id.imageView9);
//        imageView.startAnimation(animation);

    }

    private void loadBackdrop(int image) {
        final ImageView imageView9 = findViewById(R.id.imageView9);
        Glide.with(this)
                .load(image)
                .into(imageView9);
    }
}
