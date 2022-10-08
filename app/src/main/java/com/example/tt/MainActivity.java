package com.example.tt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterViewFlipper;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    AdapterViewFlipper flipper;
    ArrayList<AdapterFlipperModel> flipper_data;
    AdapterFlipper_BaseAdapter flipper_baseadapter;

    CardView Alltrips, amritsar,newdelhi, agra, varanasi, udaypur, kolkata;
    ImageButton explore ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = findViewById(R.id.adapter_flipper_home); //main flipper of the home which would be shown in application

        flipper_data = new ArrayList<>();

        //Adding items to flipper_data arraylist.
        flipper_data.add(new AdapterFlipperModel("Taj Mahal", "Agra", R.drawable.agra_taj_mahal)); //setting values to the items which were in the constructor of model adpater java class
        flipper_data.add(new AdapterFlipperModel("Akshardham Temple", "Delhi", R.drawable.new_delhi_akshardham_temple));
        flipper_data.add(new AdapterFlipperModel("Amritsar Golden Temple", "Amritsar", R.drawable.amritsar_golden_temple));
        flipper_data.add(new AdapterFlipperModel("Lake Pichola", "Udaipur", R.drawable.udaipur_lake_pichola));
        flipper_data.add(new AdapterFlipperModel("Victoria Memorial Hall", "Kolkata", R.drawable.kolkata_victoria_memorial_hall));

        //Setting the adapter
        flipper_baseadapter = new AdapterFlipper_BaseAdapter(this, flipper_data) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return null;
            }
        };
        flipper.setAdapter((Adapter) flipper_baseadapter);

        //Few settings for controlling the flipper
        flipper.setAutoStart(true); //start when the application starts without the user click.
        flipper.setFlipInterval(3000); //3000 milliseconds = 3 seconds.

        amritsar = findViewById(R.id.amritsar_home);
        amritsar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, City_Information.class));
            }
        });

        newdelhi = findViewById(R.id.newdelhi);
        newdelhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,newdelhi.class);
                startActivity(intent);
            }
        });

        agra = findViewById(R.id.agra);
        agra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,agra.class);
                startActivity(intent);
            }
        });

        varanasi = findViewById(R.id.varanasi);
        varanasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,varanasi.class);
                startActivity(intent);
            }
        });

        udaypur = findViewById(R.id.udaypur);
        udaypur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,udaypur.class);
                startActivity(intent);
            }
        });

        kolkata = findViewById(R.id.kolkata);
        kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,kolkata.class);
                startActivity(intent);
            }
        });
        explore = findViewById(R.id.imageView4);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink("https://www.google.co.in/maps/place/Amritsar,+Punjab/@31.633525,74.8000794,12z/data=!3m1!4b1!4m5!3m4!1s0x391964aa569e7355:0xeea2605bee84ef7d!8m2!3d31.6339793!4d74.8722642");
            }
        });

        explore = findViewById(R.id.imageView7);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink("https://www.booking.com/index.en.html?aid=309654;label=hotels-english-en-india-pWa91BJPbHVSocGZUN7vQQS432876510917:pl:ta:p1:p2:ac:ap:neg:fi:tiaud-297601666995:kwd-22550701:lp1007759:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YcsZ-Id2vkzIfTmYhvC5HOg;ws=&gclid=Cj0KCQjwnP-ZBhDiARIsAH3FSRcuO7mMWnBmPdTWjpOuwokxUlAl4g5yoSQRe4OP4iYiGg_KWbfiSTMaAnfgEALw_wcB");
            }
        });


    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
