package com.example.flowers.flower;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.flowers.R;

public class MainActivity1 extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);

        final Activity activity = this;


        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfHaGRha5ZKVLQZCL78DpkMp2_L074zRZe1yGz8R0epMIplQQ/viewform?usp=sf_link");

        setContentView(webView);



    }
}