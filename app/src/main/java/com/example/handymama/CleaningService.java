package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class CleaningService extends AppCompatActivity {

    private SeekBar seekBar1, seekBar2;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView23;
    ImageView imageView21;
    ImageView imageView20;
    TextView textView41, textView42, textView43, textView44;
    private BottomSheetDialog bottomSheetDialog;
    TextView textView55, textView56, textView57;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_service);


        bottomSheetDialog = new BottomSheetDialog(CleaningService.this);
        final View bottomSheetDialogView = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
        bottomSheetDialog.setContentView(bottomSheetDialogView);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();

                switch (id){
                    case R.id.button3:
                        bottomSheetDialog.show();
                        break;
                }
            }
        });

        textView55 = bottomSheetDialogView.findViewById(R.id.textView55);
        textView56 = bottomSheetDialogView.findViewById(R.id.textView56);
        textView57 = bottomSheetDialogView.findViewById(R.id.textView57);

        textView55.setTextColor(getResources().getColor(R.color.white));

        textView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView55 != null){
                    textView55.setBackgroundResource(R.drawable.backgroundtext);
                    textView55.setTextColor(getResources().getColor(R.color.white));

                    textView56.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView56.setTextColor(getResources().getColor(R.color.black));

                    textView57.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView57.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        textView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView56 != null){
                    textView56.setBackgroundResource(R.drawable.backgroundtext);
                    textView56.setTextColor(getResources().getColor(R.color.white));

                    textView55.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView55.setTextColor(getResources().getColor(R.color.black));

                    textView57.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView57.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        textView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView57 != null){
                    textView57.setBackgroundResource(R.drawable.backgroundtext);
                    textView57.setTextColor(getResources().getColor(R.color.white));

                    textView56.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView56.setTextColor(getResources().getColor(R.color.black));

                    textView55.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView55.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        ImageView imageView = (ImageView) bottomSheetDialogView.findViewById(R.id.imageView19);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CleaningService.this, MapScreen.class);
                startActivity(intent);
                finish();
            }
        });
//        ImageView imageView1 = (ImageView) bottomSheetDialogView.findViewById(R.id.imageView18);
//
//        imageView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        final TextView textView23 = findViewById(R.id.textView23);
        final TextView textView26 = findViewById(R.id.textView26);
        final TextView textView25 = findViewById(R.id.textView25);
        final TextView textView27 = findViewById(R.id.textView27);
        final TextView textView24 = findViewById(R.id.textView24);

        imageView16=findViewById(R.id.imageView16);
        imageView17=findViewById(R.id.imageView17);
        imageView23=findViewById(R.id.imageView23);
        imageView21=findViewById(R.id.imageView21);
        imageView20=findViewById(R.id.imageView20);

        textView41 = findViewById(R.id.textView41);
        textView42 = findViewById(R.id.textView42);
        textView43 = findViewById(R.id.textView43);
        textView44 = findViewById(R.id.textView44);


        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView41 != null){
                    textView41.setBackgroundResource(R.drawable.backgroundtext);
                    textView41.setTextColor(getResources().getColor(R.color.white));

                    textView42.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView42.setTextColor(getResources().getColor(R.color.black));

                    textView43.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView43.setTextColor(getResources().getColor(R.color.black));

                    textView44.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView44.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        textView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView42 != null){
                    textView42.setBackgroundResource(R.drawable.backgroundtext);
                    textView42.setTextColor(getResources().getColor(R.color.white));

                    textView41.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView41.setTextColor(getResources().getColor(R.color.black));

                    textView43.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView43.setTextColor(getResources().getColor(R.color.black));

                    textView44.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView44.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        textView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView43 != null){
                    textView43.setBackgroundResource(R.drawable.backgroundtext);
                    textView43.setTextColor(getResources().getColor(R.color.white));

                    textView42.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView42.setTextColor(getResources().getColor(R.color.black));

                    textView41.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView41.setTextColor(getResources().getColor(R.color.black));

                    textView44.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView44.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        textView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView44 != null){
                    textView44.setBackgroundResource(R.drawable.backgroundtext);
                    textView44.setTextColor(getResources().getColor(R.color.white));

                    textView42.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView42.setTextColor(getResources().getColor(R.color.black));

                    textView43.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView43.setTextColor(getResources().getColor(R.color.black));

                    textView41.setBackgroundResource(R.drawable.backgroundwhitetext);
                    textView41.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        imageView16.setColorFilter(getResources().getColor(R.color.white));

        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView16!=null){
                    imageView16.setBackgroundResource(R.drawable.backgroundgreen);
                    imageView16.setColorFilter(getResources().getColor(R.color.white));
                    imageView17.setBackgroundResource(R.drawable.whitebackground);
                    imageView17.setColorFilter(R.color.black);
                    imageView23.setBackgroundResource(R.drawable.whitebackground);
                    imageView23.setColorFilter(R.color.black);
                    imageView21.setBackgroundResource(R.drawable.whitebackground);
                    imageView21.setColorFilter(R.color.black);
                    imageView20.setBackgroundResource(R.drawable.whitebackground);
                    imageView20.setColorFilter(R.color.black);
                }
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView17!=null){
                    imageView17.setBackgroundResource(R.drawable.backgroundgreen);
                    imageView17.setColorFilter(getResources().getColor(R.color.white));
                    imageView16.setBackgroundResource(R.drawable.whitebackground);
                    imageView16.setColorFilter(R.color.black);
                    imageView23.setBackgroundResource(R.drawable.whitebackground);
                    imageView23.setColorFilter(R.color.black);
                    imageView21.setBackgroundResource(R.drawable.whitebackground);
                    imageView21.setColorFilter(R.color.black);
                    imageView20.setBackgroundResource(R.drawable.whitebackground);
                    imageView20.setColorFilter(R.color.black);
                }


            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView23!=null){
                    imageView23.setBackgroundResource(R.drawable.backgroundgreen);
                    imageView23.setColorFilter(getResources().getColor(R.color.white));
                    imageView16.setBackgroundResource(R.drawable.whitebackground);
                    imageView16.setColorFilter(R.color.black);
                    imageView17.setBackgroundResource(R.drawable.whitebackground);
                    imageView17.setColorFilter(R.color.black);
                    imageView21.setBackgroundResource(R.drawable.whitebackground);
                    imageView21.setColorFilter(R.color.black);
                    imageView20.setBackgroundResource(R.drawable.whitebackground);
                    imageView20.setColorFilter(R.color.black);
                }


            }
        });
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView21!=null){
                    imageView21.setBackgroundResource(R.drawable.backgroundgreen);
                    imageView21.setColorFilter(getResources().getColor(R.color.white));
                    imageView16.setBackgroundResource(R.drawable.whitebackground);
                    imageView16.setColorFilter(R.color.black);
                    imageView23.setBackgroundResource(R.drawable.whitebackground);
                    imageView23.setColorFilter(R.color.black);
                    imageView17.setBackgroundResource(R.drawable.whitebackground);
                    imageView17.setColorFilter(R.color.black);
                    imageView20.setBackgroundResource(R.drawable.whitebackground);
                    imageView20.setColorFilter(R.color.black);
                }


            }
        });
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView20!=null){
                    imageView20.setBackgroundResource(R.drawable.backgroundgreen);
                    imageView20.setColorFilter(getResources().getColor(R.color.white));
                    imageView16.setBackgroundResource(R.drawable.whitebackground);
                    imageView16.setColorFilter(R.color.black);
                    imageView23.setBackgroundResource(R.drawable.whitebackground);
                    imageView23.setColorFilter(R.color.black);
                    imageView21.setBackgroundResource(R.drawable.whitebackground);
                    imageView21.setColorFilter(R.color.black);
                    imageView17.setBackgroundResource(R.drawable.whitebackground);
                    imageView17.setColorFilter(R.color.black);
                }


            }
        });

        seekBar1 = findViewById(R.id.seekBarRoom);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                showToast("SeekBar Progress: " + progress);
                if(progress <=10){
                    textView23.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView23.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 10 && progress <= 25){
                    textView26.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView26.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 25 && progress <= 50){
                    textView25.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView25.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 50 && progress <= 75){
                    textView27.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView27.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 75 && progress <= 100){
                    textView24.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView24.setTextColor(getResources().getColor(R.color.black));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(10);
            }
        });
        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(25);
            }
        });
        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(50);
            }
        });
        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(75);
            }
        });
        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(100);
            }
        });

        final TextView textView29 = findViewById(R.id.textView29);
        final TextView textView32 = findViewById(R.id.textView32);
        final TextView textView31 = findViewById(R.id.textView31);
        final TextView textView33 = findViewById(R.id.textView33);
        final TextView textView30 = findViewById(R.id.textView30);

        seekBar2 = findViewById(R.id.seekBarToilet);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                showToast("SeekBar Progress: " + progress);
                if(progress <=10){
                    textView29.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView29.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 10 && progress <= 25){
                    textView32.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView32.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 25 && progress <= 50){
                    textView31.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView31.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 50 && progress <= 75){
                    textView33.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView33.setTextColor(getResources().getColor(R.color.black));
                }
                if(progress > 75 && progress <= 100){
                    textView30.setTextColor(getResources().getColor(R.color.appgreen));
                } else {
                    textView30.setTextColor(getResources().getColor(R.color.black));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress(10);
            }
        });
        textView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress(25);
            }
        });
        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress(50);
            }
        });
        textView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress(75);
            }
        });
        textView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar2.setProgress(100);
            }
        });




    }
    private void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
