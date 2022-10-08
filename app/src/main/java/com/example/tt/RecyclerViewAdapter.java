package com.example.tt;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    public RecyclerViewAdapter(City_Information city_information, ArrayList<RecyclerViewModel> list) {
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewModel> list, homeadapterflipper homeadapterflipper) {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
