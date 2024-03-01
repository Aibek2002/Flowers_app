package com.example.flowers.settings_in;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.flowers.R;

public class Voprosik extends AppCompatActivity {

    TextView detailsText1;
    LinearLayout layout1;
    TextView detailsText2;
    LinearLayout layout2;
    TextView detailsText3;
    LinearLayout layout3;
    TextView detailsText4;
    LinearLayout layout4;
    TextView detailsText5;
    LinearLayout layout5;
    TextView detailsText6;
    LinearLayout layout6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voprosik);
        detailsText1 = findViewById(R.id.details1);
        layout1 = findViewById(R.id.layout1);

        detailsText2 = findViewById(R.id.details2);
        layout2 = findViewById(R.id.layout2);

        detailsText3 = findViewById(R.id.details3);
        layout3 = findViewById(R.id.layout3);

        detailsText4 = findViewById(R.id.details4);
        layout4 = findViewById(R.id.layout4);

        detailsText5 = findViewById(R.id.details5);
        layout5 = findViewById(R.id.layout5);

        detailsText6 = findViewById(R.id.details6);
        layout6 = findViewById(R.id.layout6);



        layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

    }

    public void expand1(View view) {
        int v = (detailsText1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        detailsText1.setVisibility(v);
    }

    public void expand2(View view) {
        int v = (detailsText2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        detailsText2.setVisibility(v);
    }

    public void expand3(View view) {
        int v = (detailsText3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        detailsText3.setVisibility(v);
    }

    public void expand4(View view) {
        int v = (detailsText4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        detailsText4.setVisibility(v);
    }

    public void expand5(View view) {
        int v = (detailsText5.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout5, new AutoTransition());
        detailsText5.setVisibility(v);
    }

    public void expand6(View view) {
        int v = (detailsText6.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout6, new AutoTransition());
        detailsText6.setVisibility(v);
    }



}