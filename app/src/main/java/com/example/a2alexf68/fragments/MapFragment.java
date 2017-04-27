package com.example.a2alexf68.fragments;

import android.app.Activity;
import android.app.Fragment;
import org.osmdroid.config.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;


public class MapFragment extends Fragment {
    MapView mv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mapfragment, parent);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Activity activity = getActivity();

        Configuration.getInstance().load(activity, PreferenceManager.getDefaultSharedPreferences(activity));

        mv = (MapView) activity.findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.getController().setZoom(14);
        mv.getController().setCenter(new GeoPoint(51.05,-0.72));

    }
    public void SetLocation (double lat, double lon){
        mv.getController().setCenter(new GeoPoint(lat,lon));
    }
}
