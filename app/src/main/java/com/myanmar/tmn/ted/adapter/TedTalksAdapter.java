package com.myanmar.tmn.ted.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.myanmar.tmn.ted.R;
import com.myanmar.tmn.ted.viewHolder.TedTalksViewHolder;

/**
 * Created by msi on 1/30/2018.
 */

public class TedTalksAdapter extends RecyclerView.Adapter{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TedTalksViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_ted_talks,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
