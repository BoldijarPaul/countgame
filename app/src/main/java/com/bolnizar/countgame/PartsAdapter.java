package com.bolnizar.countgame;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Paul on 7/3/2016.
 */

public class PartsAdapter extends FragmentPagerAdapter {

    private Fragment[] mFragments;

    public PartsAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new Fragment[10];
        for (int i = 0; i < 10; i++)
            mFragments[i] = new PartFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return mFragments.length;
    }

    @Override
    public float getPageWidth(int position) {
        return .5f;
    }
}
