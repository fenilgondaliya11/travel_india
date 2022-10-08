package com.example.tt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class City_Information extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager manager;
    ArrayList<RecyclerViewModel> list = new ArrayList<>();
    RecyclerViewItemDecoration decoration;
    Button explore;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_information);

        ///// RECYCLER VIEW :

        list.add(new RecyclerViewModel("The Golden Temple", "2 km", R.drawable.amritsar_golden_temple, 4.5f));
        list.add(new RecyclerViewModel("Wagah Border", "28 km", R.drawable.amritsar_wagah_border, 4f));
        list.add(new RecyclerViewModel("Jallianwala Bagh", "2 km", R.drawable.amritsar_jallianwala_bagh, 4.5f));
        list.add(new RecyclerViewModel("Partition Museum", "3 km", R.drawable.amritsar_partition_museum, 3f));

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
        manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        decoration = new RecyclerViewItemDecoration(16);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(decoration);

        explore = findViewById(R.id.button);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.google.co.in/maps/place/Amritsar,+Punjab/@31.633525,74.8000794,12z/data=!3m1!4b1!4m5!3m4!1s0x391964aa569e7355:0xeea2605bee84ef7d!8m2!3d31.6339793!4d74.8722642");
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.booking.com/luxury/city/in/amritsar.en-gb.html?aid=1135788&label=amritsar-WuwwKudWDXScZGeQYGwK6AS388576814591%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-4253272543%3Alp1007759%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YcX_GyndjDE1AGi2KmfjYHk&sid=e4d4225b27b9595a1b5ab54ff756a461&keep_landing=1&gclid=Cj0KCQjwnP-ZBhDiARIsAH3FSRe7zDsFyUu8Rw8lZCCxCouPOmkge4NctrD_K76UJUJQ9MGfbGcB6_EaAli2EALw_wcB&");
            }
        });

    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
