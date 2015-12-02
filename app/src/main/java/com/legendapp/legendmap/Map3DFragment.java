package com.legendapp.legendmap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amap.api.maps.MapView;

/**
 * Created by Legen on 2015/12/2.
 */
public class Map3DFragment extends Fragment{

//    static Map3DFragment setFragment(){
//        Map3DFragment map3DFragment = new Map3DFragment();
//        return map3DFragment;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.map3d,container,false);
        MapView map3dView = (MapView) view.findViewById(R.id.map3d);
        return view;
    }

    private static void setMapFratment() {

    }

}
