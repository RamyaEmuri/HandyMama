package com.example.handymama;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(OnBoarding onBoarding) {
        this.context = onBoarding;
    }


    public int[] slide_image = {
            R.drawable.view1,
            R.drawable.view2,
            R.drawable.thumb,

    };

    public String[] slide_description = {
            "Book experinced handymen for your\n Home and Office instantly!",
            "HandyMama matches you with a\nhighly rated professional.",
            "After service, rate the HandyMama\n to help us deliver quality service ",
    };

    @Override
    public int getCount() {
        return slide_image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==(ConstraintLayout) object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.view_pager_screen, container,false);


        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewPager);
        TextView textView1 = (TextView) view.findViewById(R.id.textViewPager);

        imageView.setImageResource(slide_image[position]);
        textView1.setText(slide_description[position]);

        container.addView(view);
        if (position==0){
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.view_images);
            imageView.startAnimation(animation);
        }
        if(position==1){
            Animation animation1 = AnimationUtils.loadAnimation(context, R.anim.view_images);
            imageView.startAnimation(animation1);
        }
       if (position==2){
            Animation animation3 = AnimationUtils.loadAnimation(context, R.anim.slide_animation);
            imageView.startAnimation(animation3);
        }
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }

}
