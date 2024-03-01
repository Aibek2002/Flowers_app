package com.example.flowers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Intro_View extends AppCompatActivity {

    LottieAnimationView lottie;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_view);



        lottie = findViewById(R.id.lotye);
        imageView = findViewById(R.id.imageintro);

        lottie.animate().translationX(0).translationY(18000).setDuration(2000).setStartDelay(2900);
        imageView.animate().translationX(0).translationY(18000).setDuration(2700).setStartDelay(2900);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        },3700);
    }
}