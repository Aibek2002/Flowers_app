package com.example.flowers.flower;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.flowers.R;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);

        final Activity activity = this;


        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdXpYfldfa6c56iHR9xc2VQt5QC1zbkiM7QwkB6HCcw2BjM4A/viewform?usp=sf_link");

        setContentView(webView);



    }
}