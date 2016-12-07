package com.gmail.bones03052.pathfinder.gui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

import com.gmail.bones03052.pathfinder.MainActivity;
import com.gmail.bones03052.pathfinder.R;
import com.gmail.bones03052.pathfinder.settlement.Settlement;
import com.gmail.bones03052.pathfinder.settlement.TownGovernments;

public class SettlementViewer extends Fragment
{

    private int settlementNum;

    public SettlementViewer()
    {
        // Required empty public constructor
    }

    //TODO: Acquire bundle and use int to find proper settlement, then load it into view

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        final View rootView=inflater.inflate(R.layout.fragment_settlement_viewer,container,false);

        //TODO: "don't worry, I will fix this!"
        TabHost tab=(TabHost)rootView.findViewById(R.id.TabHost);
        tab.setup();
        TabHost.TabSpec spec=tab.newTabSpec("Overview");
        spec.setContent(R.id.Overview);
        spec.setIndicator("Overview");
        tab.addTab(spec);
        spec=tab.newTabSpec("Build Grid");
        spec.setContent(R.id.Build_Grid);
        spec.setIndicator("Build Grid");
        tab.addTab(spec);
        ((Spinner)rootView.findViewById(R.id.alignSpinner)).setSelection(Settlement.NEUTRAL);

        Button save=(Button)rootView.findViewById(R.id.button_save);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Settlement s=new Settlement();
                s.setName(((TextView)rootView.findViewById(R.id.settlementNameEdit)).getText().toString());
                s.setAlignment(((Spinner)rootView.findViewById(R.id.alignSpinner)).getSelectedItemPosition());
                s.setTownGovernment(MainActivity.database.findTownGovernment(((Spinner)rootView.findViewById(R.id.govSpinner)).getSelectedItemPosition()));
                MainActivity.settlements.add(s);
                Log.v("Pathfinder-settlement:","successfully saved new settlement \""+s.getName()+"\" (hopefully).");
            }
        });
        return rootView;
    }


}






