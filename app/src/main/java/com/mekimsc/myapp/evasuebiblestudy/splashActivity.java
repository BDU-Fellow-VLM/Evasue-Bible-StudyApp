package com.mekimsc.myapp.evasuebiblestudy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class splashActivity extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 6000);

        TextView textView_1 = findViewById(R.id.img);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade);
        textView_1.startAnimation(fadeInAnimation);

        ImageView imageView = findViewById(R.id.eva_logo);
        Animation fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.fade);
        imageView.startAnimation(fadeAnimation);

         //imageView.setImageDrawable(td);
        TextView textView_3 = findViewById(R.id.version_code);
        Animation fadeInAnimation1 = AnimationUtils.loadAnimation(this, R.anim.fade);
        textView_3.startAnimation(fadeInAnimation1);


    }
}

