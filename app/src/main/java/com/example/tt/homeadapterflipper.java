package com.example.tt;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class homeadapterflipper extends Activity {

    RecyclerView recyclerView;
    LinearLayoutManager manager;
    ArrayList<RecyclerViewModel> list = new ArrayList<>();
    RecyclerViewItemDecoration decoration;

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

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list, this);
        manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        decoration = new RecyclerViewItemDecoration(16);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(decoration);

    }

}
