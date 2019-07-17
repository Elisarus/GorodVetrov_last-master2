package com.example.elisarus.gorodvetrov;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Day_text extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View text_day = inflater.inflate(R.layout.fragment_day_text, container, false);

       /// TextView day_text = (TextView) text_day.findViewById(R.id.day_text);

        return  text_day;






    }




}
