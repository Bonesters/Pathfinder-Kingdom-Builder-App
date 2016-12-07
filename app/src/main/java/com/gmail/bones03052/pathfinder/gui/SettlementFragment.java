package com.gmail.bones03052.pathfinder.gui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.bones03052.pathfinder.R;
import com.gmail.bones03052.pathfinder.gui.SettlementList.SettlementItem;

/**
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class SettlementFragment extends Fragment
{

    private int numColumns=1;
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public SettlementFragment()
    {

    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        if(getArguments()!=null)
        {
            numColumns=1;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_settlement_list,container,false);

        // Set the adapter
        if(view instanceof RecyclerView)
        {
            Context context=view.getContext();
            RecyclerView recyclerView=(RecyclerView)view;
            if(numColumns<=1)
            {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            }
            else
            {
                recyclerView.setLayoutManager(new GridLayoutManager(context,numColumns));
            }
            recyclerView.setAdapter(new SettlementViewAdapter(SettlementList.ITEMS,mListener));
        }
        return view;
    }


    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        try
        {
            mListener=(OnListFragmentInteractionListener)getActivity();
        }
        catch(ClassCastException e)
        {
            throw new ClassCastException(getActivity().toString()
                    +" must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        mListener=null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     */
    public interface OnListFragmentInteractionListener
    {
        // TODO: Update argument type and name
        public void onListFragmentInteraction(SettlementItem item);
    }
}
