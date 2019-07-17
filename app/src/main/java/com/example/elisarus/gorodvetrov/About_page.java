package com.example.elisarus.gorodvetrov;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class About_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        String[][] array = {{"Привет", "Здорово"},
                {"Как твои дела?"}};
    }
}
