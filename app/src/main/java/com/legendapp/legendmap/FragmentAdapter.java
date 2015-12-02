package com.legendapp.legendmap;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * Created by Administrator on 2015/12/1.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    ArrayList<android.support.v4.app.Fragment> list;
    public FragmentAdapter(FragmentManager fm,ArrayList<android.support.v4.app.Fragment> list) {
        super(fm);
        this.list=list;
    }

    //指定位置
    @Override
    public android.support.v4.app.Fragment getItem(int arg0) {
        return list.get(arg0);
    }

    //指定数量
    @Override
    public int getCount() {
        return list.size();
    }
}
