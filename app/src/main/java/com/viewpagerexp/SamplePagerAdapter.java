package com.viewpagerexp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class SamplePagerAdapter extends FragmentPagerAdapter {

    private ArrayList<SampleModel> list;

    public SamplePagerAdapter(FragmentManager fm, ArrayList<SampleModel> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return new SampleFragment(list.get(position).getPaymentList());
    }

    @Override
    public int getCount() {
        return list.size();
    }
}