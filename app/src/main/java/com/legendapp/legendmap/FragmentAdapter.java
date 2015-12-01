package com.legendapp.legendmap;


import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * Created by Administrator on 2015/12/1.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> list;
    public FragmentAdapter(FragmentManager fm,ArrayList<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int arg0) {
        return list.get(arg0);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
