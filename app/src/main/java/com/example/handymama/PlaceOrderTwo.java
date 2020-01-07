package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceOrderTwo extends AppCompatActivity {

    final Context context = this;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order_two);
        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog1);
                Button dialogButton = (Button) dialog.findViewById(R.id.buttonConfirmBooking);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        final Dialog dialog1 = new Dialog(context);
                        dialog1.setContentView(R.layout.dialog2);
                        dialog.dismiss();
                        ImageView imageView = (ImageView) dialog1.findViewById(R.id.imageViewCross);
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog1.dismiss();
                            }
                        });

                        TextView textView = (TextView) dialog1.findViewById(R.id.textView77);
                        textView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(PlaceOrderTwo.this, MyBooking.class);
                                startActivity(intent);
                                dialog1.dismiss();
                            }
                        });
                        dialog1.show();
                    }
                });
                dialog.show();

            }
        });

    }
}
