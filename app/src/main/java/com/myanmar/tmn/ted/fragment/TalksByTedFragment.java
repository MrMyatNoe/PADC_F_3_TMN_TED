package com.myanmar.tmn.ted.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.ted.R;
import com.myanmar.tmn.ted.adapter.TedTalksAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by msi on 1/30/2018.
 */

public class TalksByTedFragment extends Fragment{

    @BindView(R.id.rv_talks)
    RecyclerView rvTalks;

    TedTalksAdapter tedTalksAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ted_news_by_category,container,false);
        ButterKnife.bind(this,view);

        LinearLayoutManager talkLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvTalks.setLayoutManager(talkLayoutManager);

        tedTalksAdapter = new TedTalksAdapter();
        rvTalks.setAdapter(tedTalksAdapter);
        return view;
    }
}
