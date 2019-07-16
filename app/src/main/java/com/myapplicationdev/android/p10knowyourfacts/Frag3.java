package com.myapplicationdev.android.p10knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    LinearLayout ll3;
    Button btnColor;
    Integer i = 0;

    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        btnColor = view.findViewById(R.id.btnColor);
        ll3 = view.findViewById(R.id.ll3);
        ll3.setBackgroundColor(Color.CYAN);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( i==0) {
                    ll3.setBackgroundColor(Color.GREEN);
                    i = 1;
                }else {
                    ll3.setBackgroundColor(Color.CYAN);
                    i = 0;
                }
            }
        });

        return view;
    }

}