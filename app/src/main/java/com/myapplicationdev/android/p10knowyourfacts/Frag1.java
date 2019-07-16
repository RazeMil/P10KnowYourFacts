package com.myapplicationdev.android.p10knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    LinearLayout ll1;
    Button btnColor;
    Integer i = 0;
    public Frag1() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        btnColor = view.findViewById(R.id.btnColor);
        ll1 = view.findViewById(R.id.ll1);
        ll1.setBackgroundColor(Color.GRAY);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( i==0) {
                    ll1.setBackgroundColor(Color.YELLOW);
                    i = 1;
                }else {
                    ll1.setBackgroundColor(Color.GRAY);
                    i = 0;
                }
            }
        });

        return view;
    }

}