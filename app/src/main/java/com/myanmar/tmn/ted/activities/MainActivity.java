package com.myanmar.tmn.ted.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.myanmar.tmn.ted.R;
import com.myanmar.tmn.ted.adapter.NewsByTedAdapter;
import com.myanmar.tmn.ted.fragment.PlaylistsByTedFragment;
import com.myanmar.tmn.ted.fragment.PodcastsByTedFragment;
import com.myanmar.tmn.ted.fragment.TalksByTedFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp_news_by_ted)
    ViewPager vpNewsByTed;

    @BindView(R.id.tl_ted_by_category)
    TabLayout tlTedByCategory;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private NewsByTedAdapter newsByTedAdapter;

    private TabLayout tabLayout;

    private String tabs[]= {"Hello","GYy","damn"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);*/
        setSupportActionBar(toolbar);

        newsByTedAdapter = new NewsByTedAdapter(getSupportFragmentManager());

        vpNewsByTed.setAdapter(newsByTedAdapter);
        newsByTedAdapter.addTab("", new TalksByTedFragment());
        newsByTedAdapter.addTab("", new PlaylistsByTedFragment());
        newsByTedAdapter.addTab("", new PodcastsByTedFragment());
        newsByTedAdapter.addTab("", new TalksByTedFragment());
        newsByTedAdapter.addTab("", new TalksByTedFragment());

        tlTedByCategory.setupWithViewPager(vpNewsByTed);
        setUpTabIcons();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                startActivity(new Intent(MainActivity.this,TedSearchActivity.class));
            }
        });
    }

    private void setUpTabIcons() {
        tlTedByCategory.getTabAt(0).setIcon(R.drawable.ic_format_list_bulleted_black_24dp);
        tlTedByCategory.getTabAt(1).setIcon(R.drawable.ic_subscriptions_black_24dp);
        tlTedByCategory.getTabAt(2).setIcon(R.drawable.ic_headset_black_24dp);
        tlTedByCategory.getTabAt(3).setIcon(R.drawable.ic_lightbulb_outline_black_24dp);
        tlTedByCategory.getTabAt(4).setIcon(R.drawable.ic_account_circle_black_24dp);

        tlTedByCategory.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setTint(Color.RED);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setTint(Color.BLACK);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
