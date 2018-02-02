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
import com.myanmar.tmn.ted.adapter.TedPodcastsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by msi on 1/31/2018.
 */

public class PodcastsByTedFragment extends Fragment {

    @BindView(R.id.rv_podcasts)
    RecyclerView rvPodcasts;

    private TedPodcastsAdapter tedPodcastsAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ted_news_by_podcast,container,false);
        ButterKnife.bind(this,view);

        LinearLayoutManager podcastManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvPodcasts.setLayoutManager(podcastManager);
        tedPodcastsAdapter = new TedPodcastsAdapter();
        rvPodcasts.setAdapter(tedPodcastsAdapter);
        return view;
    }
}
