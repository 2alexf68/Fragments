package com.example.a2alexf68.fragments;

import android.content.Intent;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;


public class MainActivity extends AppCompatActivity {
    MapFragment map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map=(MapFragment)getFragmentManager().findFragmentById(R.id.mapFragment);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);//id missing
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.cityOne)// id of the 1st city
        {
            // react to the menu item being selected...
            map.SetLocation(48.85,2.34);
            return true;
        }
        else if (item.getItemId() == R.id.cityTwo)// id of the 2 city
        {
            // react to the menu item being selected...
            map.SetLocation(51.51,-0.1);
            return true;
        }
        else if(item.getItemId() == R.id.cityThree)// id of the 3 city
        {
            // react to the menu item being selected...
            map.SetLocation(40.75,-74);
            return true;
        }
        return false;
    }


}
