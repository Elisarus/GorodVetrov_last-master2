package com.example.elisarus.gorodvetrov;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.elisarus.gorodvetrov.Resource_page;

import java.util.Random;

public class Load_game extends AppCompatActivity {

    public int sharedPref(){
        SharedPreferences prfs = getSharedPreferences("DAY_NUMBER", Context.MODE_PRIVATE);
        int day_number = prfs.getInt("day_number", 0);
        return day_number;
    }
    final String[] day_array = {"gsdgsgdsdg", "sdgsdgsdgsgd22", "sdgsdgsdgs213gd", "sdgsdgsdg145sgd", "sdgsdgsdgs125gd", "sdgsdgsdgs215gd", "sdgsdgs`241dgsgd", "sdgsdgsdg215sgd", "sdgsd643gsdgsgd", "sdgsd547gsdgsgd"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_game);

        //day_number getting from sharedpref
        sharedPref();


        Button button_next_day = findViewById(R.id.btn_next_day);
        Button resources_btn = findViewById(R.id.btn_resources);

        final TextView day_description = findViewById(R.id.day_description);

        final   Random random = new Random();
        day_description.setText(day_array[sharedPref()]);


        button_next_day.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                int rnd = random.nextInt(10);
                day_description.setText(day_array[rnd]);
            }

        });

        resources_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load_game.this, Resource_page.class);

                String day_desc =  day_description.getText().toString();

                int day_number = 0;

                for(int i=0; i<10; i++) {

                    if (day_desc.equalsIgnoreCase(day_array[i])) {
                        day_number = i;

                    } else{

                    }

                }

                String day_number_string = Integer.toString(day_number);


                intent.putExtra("day_number", day_number_string);
                startActivity(intent);
            }
        });

    }
}
