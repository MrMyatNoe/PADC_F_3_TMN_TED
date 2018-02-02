package com.myanmar.tmn.ted.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.myanmar.tmn.ted.R;
import com.myanmar.tmn.ted.viewHolder.TedSearchViewHolder;

/**
 * Created by msi on 2/2/2018.
 */

public class TedSearchAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TedSearchViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_search,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
