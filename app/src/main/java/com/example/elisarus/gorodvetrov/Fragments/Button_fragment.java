package com.example.elisarus.gorodvetrov.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import com.example.elisarus.gorodvetrov.Main_page;
import com.example.elisarus.gorodvetrov.R;

import java.util.Random;


public class Button_fragment extends Fragment implements View.OnClickListener{





    Random random = new Random();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View button_fragment = inflater.inflate(R.layout.fragment_button_fragment, container, false);

       /* Button button_resources = (Button) button_fragment.findViewById(R.id.button_resources);
        Button button_next_day = (Button) button_fragment.findViewById(R.id.button_next_day);

        button_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
        */

        Button button_next_day = button_fragment.findViewById(R.id.button_next_day);

        button_next_day.setOnClickListener(this);



        return button_fragment;




    }

    @Override
    public void onClick(View button_fragment) {



    }

}




