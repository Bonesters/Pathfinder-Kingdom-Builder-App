package com.gmail.bones03052.pathfinder.gui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.bones03052.pathfinder.R;

public class SettlementViewer extends Fragment {

    private int settlementNum;

    public SettlementViewer() {
        // Required empty public constructor
    }

    //TODO: Acquire bundle and use int to find proper settlement, then load it into view

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_settlement_viewer, container, false);

        /*
        Button myBtn = (Button) rootView.findViewById(R.id.myBtn1);
        myBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                Fragment fragment2 = new MyFragment2();
                transaction.replace(R.id.container, fragment2);
                transaction.commit();
            }
        } );

        */

        return rootView;
    }


}






