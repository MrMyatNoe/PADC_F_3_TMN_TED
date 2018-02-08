package com.myanmar.tmn.ted.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.myanmar.tmn.ted.R;
import com.myanmar.tmn.ted.adapter.SearchResultAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by msi on 2/2/2018.
 */

public class SearchResultActivity extends AppCompatActivity {

    @BindView(R.id.rv_search_result)
    RecyclerView rvSearchResult;

    SearchResultAdapter searchResultAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        ButterKnife.bind(this);

        LinearLayoutManager searchResultManager = new LinearLayoutManager(getApplicationContext()
                ,LinearLayoutManager.VERTICAL,false);
        rvSearchResult.setLayoutManager(searchResultManager);
        searchResultAdapter = new SearchResultAdapter();
        rvSearchResult.setAdapter(searchResultAdapter);
    }

    public static Intent searchResultIntent(Context context){
        return null;
    }
}

