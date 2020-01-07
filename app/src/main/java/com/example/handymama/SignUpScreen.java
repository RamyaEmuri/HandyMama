package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);


        Button button = findViewById(R.id.buttonSignUp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpScreen.this, HandyMamaSelectingScreen.class);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.imageViewbackArrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpScreen.this, OnBoarding.class);
                startActivity(intent);
            }
        });
    }
}
