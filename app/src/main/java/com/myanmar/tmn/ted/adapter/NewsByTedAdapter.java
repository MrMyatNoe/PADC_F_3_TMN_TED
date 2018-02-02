package com.myanmar.tmn.ted.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msi on 1/30/2018.
 */

public class NewsByTedAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentList;
    private List<String> tabTitleList;

    public NewsByTedAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<>();
        tabTitleList = new ArrayList<>();
    }

    public void addTab(String tabLabel, Fragment fragment){
        tabTitleList.add(tabLabel);
        fragmentList.add(fragment);
        //check
        notifyDataSetChanged();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
