package com.myanmar.tmn.ted.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.myanmar.tmn.ted.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by msi on 1/30/2018.
 */

public class TedTalksActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted_talks);
        ButterKnife.bind(this,this);
    }

}
