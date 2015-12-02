package com.legendapp.legendmap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amap.api.maps2d.MapView;

/**
 * Created by Legen on 2015/12/2.
 */
public class SearchFragment extends Fragment{

    //    static Map2DFragment setFragment(){
//        Map2DFragment map2DFragment = new Map2DFragment();
//        return map2DFragment;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search,container,false);
        MapView map2dView = (MapView) view.findViewById(R.id.search);
        return view;
    }

    private static void setMapFratment() {

    }
}
