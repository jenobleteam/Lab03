package com.example.apple.je;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    final static String LAYOUT_ID = "layoutID";


    public BlankFragment() {
        // Required empty public constructor
    }
    public static BlankFragment newInstance(int layoutID ){
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putInt(LAYOUT_ID,layoutID);
        fragment.setArguments(args);
        return fragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         ViewGroup root = (ViewGroup) inflater.inflate(getArguments().getInt(LAYOUT_ID,-1),container,false);
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

}
