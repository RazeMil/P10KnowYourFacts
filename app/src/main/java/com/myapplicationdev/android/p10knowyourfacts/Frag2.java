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
public class Frag2 extends Fragment {
    LinearLayout ll2;
    Button btnColor;
    Integer i = 0;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        btnColor = view.findViewById(R.id.btnColor);
        ll2 = view.findViewById(R.id.ll2);
        ll2.setBackgroundColor(Color.BLUE);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( i==0) {
                    ll2.setBackgroundColor(Color.RED);
                    i = 1;
                }else {
                    ll2.setBackgroundColor(Color.BLUE);
                    i = 0;
                }
            }
        });

        return view;
    }

}