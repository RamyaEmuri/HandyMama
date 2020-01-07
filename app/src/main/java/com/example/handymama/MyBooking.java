package com.example.handymama;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MyBooking extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SeekBar seekBar, seekBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking);

        viewPager = (ViewPager) findViewById(R.id.viewPagerMyBooking);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public void seekbar(){
        final TextView textView91 = findViewById(R.id.textView91);
        final TextView textView92 = findViewById(R.id.textView92);
        final TextView textView93 = findViewById(R.id.textView93);
        final TextView textView94 = findViewById(R.id.textView94);
        final TextView textView95 = findViewById(R.id.textView95);

        seekBar = findViewById(R.id.seekBarNew);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView91.setTextColor(getResources().getColor(R.color.black));
                if(progress ==0){
                    textView91.setTextColor(getResources().getColor(R.color.black));
                    textView92.setTextColor(getResources().getColor(R.color.grey));
                    textView93.setTextColor(getResources().getColor(R.color.grey));
                    textView94.setTextColor(getResources().getColor(R.color.grey));
                    textView95.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 1){
                    textView91.setTextColor(getResources().getColor(R.color.black));
                    textView92.setTextColor(getResources().getColor(R.color.black));
                    textView93.setTextColor(getResources().getColor(R.color.grey));
                    textView94.setTextColor(getResources().getColor(R.color.grey));
                    textView95.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 2){
                    textView91.setTextColor(getResources().getColor(R.color.black));
                    textView92.setTextColor(getResources().getColor(R.color.black));
                    textView93.setTextColor(getResources().getColor(R.color.black));
                    textView94.setTextColor(getResources().getColor(R.color.grey));
                    textView95.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 3){
                    textView91.setTextColor(getResources().getColor(R.color.black));
                    textView92.setTextColor(getResources().getColor(R.color.black));
                    textView93.setTextColor(getResources().getColor(R.color.black));
                    textView94.setTextColor(getResources().getColor(R.color.black));
                    textView95.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 4){
                    textView91.setTextColor(getResources().getColor(R.color.black));
                    textView92.setTextColor(getResources().getColor(R.color.black));
                    textView93.setTextColor(getResources().getColor(R.color.black));
                    textView94.setTextColor(getResources().getColor(R.color.black));
                    textView95.setTextColor(getResources().getColor(R.color.black));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }



    public void seekbarView2(){
        final TextView textViewS1 = findViewById(R.id.textViewS1);
        final TextView textViewS2 = findViewById(R.id.textViewS2);
        final TextView textViewS3 = findViewById(R.id.textViewS3);
        final TextView textViewS4 = findViewById(R.id.textViewS4);
        final TextView textViewS5 = findViewById(R.id.textViewS5);

        seekBar2 = findViewById(R.id.seekBarView2);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                showToast("SeekBar Progress: " + progress);
                textViewS1.setTextColor(getResources().getColor(R.color.black));
                if(progress ==0){
                    textViewS1.setTextColor(getResources().getColor(R.color.black));
                    textViewS2.setTextColor(getResources().getColor(R.color.grey));
                    textViewS3.setTextColor(getResources().getColor(R.color.grey));
                    textViewS4.setTextColor(getResources().getColor(R.color.grey));
                    textViewS5.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 1){
                    textViewS1.setTextColor(getResources().getColor(R.color.black));
                    textViewS2.setTextColor(getResources().getColor(R.color.black));
                    textViewS3.setTextColor(getResources().getColor(R.color.grey));
                    textViewS4.setTextColor(getResources().getColor(R.color.grey));
                    textViewS5.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 2){
                    textViewS1.setTextColor(getResources().getColor(R.color.black));
                    textViewS2.setTextColor(getResources().getColor(R.color.black));
                    textViewS3.setTextColor(getResources().getColor(R.color.black));
                    textViewS4.setTextColor(getResources().getColor(R.color.grey));
                    textViewS5.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 3){
                    textViewS1.setTextColor(getResources().getColor(R.color.black));
                    textViewS2.setTextColor(getResources().getColor(R.color.black));
                    textViewS3.setTextColor(getResources().getColor(R.color.black));
                    textViewS4.setTextColor(getResources().getColor(R.color.black));
                    textViewS5.setTextColor(getResources().getColor(R.color.grey));
                }
                if(progress == 4){
                    textViewS1.setTextColor(getResources().getColor(R.color.black));
                    textViewS2.setTextColor(getResources().getColor(R.color.black));
                    textViewS3.setTextColor(getResources().getColor(R.color.black));
                    textViewS4.setTextColor(getResources().getColor(R.color.black));
                    textViewS5.setTextColor(getResources().getColor(R.color.black));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    public class ViewPagerAdapter extends FragmentPagerAdapter {
        private Fragment[] childFragments;

        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
            childFragments = new Fragment[]{
                    new View1(),
                    new View2(),
                    new View3(),
            };
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return childFragments[position];
        }
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Finished";
                case 1:
                    return "Current Booking";
                case 2:
                    return "Wishlist";

            }
            return null;
        }

        @Override
        public int getCount() {
            return childFragments.length;
        }
    }
    private void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
