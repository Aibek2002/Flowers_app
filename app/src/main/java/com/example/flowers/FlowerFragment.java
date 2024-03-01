package com.example.flowers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FlowerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FlowerFragment extends Fragment {
    private Button instagram;
    private Button gis2;
    private Button tiktok;
    private Button youtube;
    private Button phone;
    private Button website;
    private Button whatsapp;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FlowerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FlowerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FlowerFragment newInstance(String param1, String param2) {
        FlowerFragment fragment = new FlowerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_flower,container, false);



        //Gooo
        instagram = view.findViewById(R.id.instagram);
        whatsapp = view.findViewById(R.id.whatsapp);
        gis2 = view.findViewById(R.id.gis2);
        tiktok = view.findViewById(R.id.tiktok);
        youtube = view.findViewById(R.id.youtube);
        phone = view.findViewById(R.id.phone);
        website = view.findViewById(R.id.website);





        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://instagram.com/stories/zhalagash_gulder/3209747856482418227?utm_source=ig_story_item_share&igshid=YTUzYTFiZDMwYg=="); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://wa.me/77081851433?text=%D0%9F%D1%80%D0%B8%D0%B2%D0%B5%D1%82!%20%F0%9F%91%8B%20%D0%9C%D0%B5%D0%BD%D1%8F%20%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D0%B5%D1%81%D1%83%D0%B5%D1%82..."); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        gis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://go.2gis.com/rq2jo"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        tiktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.tiktok.com/@tamar.mtmobile?is_from_webapp=1&sender_device=pc"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/@abekenaibek"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mParam1 = phone.getText().toString().trim();

                //Dialer Intent
                //Uri.encode(string) allows number with * and # symbols to dial
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:87081851433" + Uri.encode(mParam1)));
                startActivity(intent);
            }
        });


        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://sites.google.com/view/abekenaik"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });










        return view;
    }


}