package com.legendapp.legendmap;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.amap.api.maps2d.MapView;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {

    private ViewPager mPager;
    private ArrayList<android.support.v4.app.Fragment> mapViewList;
    private MapView map2dView,map3dView,mapSearch;
    private int currIndenx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
    }

    private void initViewPager() {
        mPager = (ViewPager) findViewById(R.id.viewpager);
        mapViewList = new ArrayList<android.support.v4.app.Fragment>();
        android.support.v4.app.Fragment map2dFragment = new Map2DFragment();
        android.support.v4.app.Fragment map3dFragment = new Map3DFragment();
        android.support.v4.app.Fragment searchFragment = new SearchFragment();

        mapViewList.add(map2dFragment);
        mapViewList.add(map2dFragment);
        mapViewList.add(searchFragment);

        mPager.setAdapter(new FragmentAdapter(getSupportFragmentManager(),mapViewList));


    }


}
