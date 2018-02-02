package com.myanmar.tmn.ted.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myanmar.tmn.ted.R;
import com.myanmar.tmn.ted.adapter.TedPlaylistsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by msi on 1/31/2018.
 */

public class PlaylistsByTedFragment extends Fragment {

    @BindView(R.id.rv_playlist)
    RecyclerView rvPlaylist;

    private TedPlaylistsAdapter tedPlaylistsAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ted_news_by_playlist,container,false);
        ButterKnife.bind(this,view);

        GridLayoutManager playlistManager = new GridLayoutManager(getContext(),2);
        rvPlaylist.setLayoutManager(playlistManager);
        tedPlaylistsAdapter = new TedPlaylistsAdapter();
        rvPlaylist.setAdapter(tedPlaylistsAdapter);
        return view;
    }
}
