package com.example.flowers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    SmoothBottomBar smoothBottomBar;
    Context context;
    TextView textView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smoothBottomBar = findViewById(R.id.buttombar);
        toolbar = findViewById(R.id.toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayaut, new HomeFragment());
        fragmentTransaction.commit();

        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                if (i==0){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.framelayaut, new HomeFragment());
                    fragmentTransaction.commit();


                    smoothBottomBar.setBarBackgroundColor(Color.parseColor("#FF1A8A00"));
                    getWindow().setNavigationBarColor(Color.parseColor("#ff7164"));
                    getWindow().setStatusBarColor(Color.parseColor("#ff5a6e"));
                    toolbar.setBackgroundColor(Color.parseColor("#A30089"));

                }
                if (i==1){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.framelayaut, new FlowerFragment());
                    fragmentTransaction.commit();

                    smoothBottomBar.setBarBackgroundColor(Color.parseColor("#FF1A8A00"));
                    getWindow().setNavigationBarColor(Color.parseColor("#ff7164"));
                    getWindow().setStatusBarColor(Color.parseColor("#ff5a6e"));
                    toolbar.setBackgroundColor(Color.parseColor("#A30089"));

                }
                if (i==2){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.framelayaut, new SettingsFragment());
                    fragmentTransaction.commit();

                    smoothBottomBar.setBarBackgroundColor(Color.parseColor("#FF1A8A00"));
                    getWindow().setNavigationBarColor(Color.parseColor("#ff7164"));
                    getWindow().setStatusBarColor(Color.parseColor("#ff5a6e"));
                    toolbar.setBackgroundColor(Color.parseColor("#A30089"));
                }

                return false;
            }
        });




    }



}