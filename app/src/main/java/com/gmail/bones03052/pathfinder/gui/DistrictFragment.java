package com.gmail.bones03052.pathfinder.gui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.bones03052.pathfinder.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DistrictFragment extends Fragment
{
    public DistrictFragment(){} // Required empty public constructor

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_district,container,false);
    }
}
