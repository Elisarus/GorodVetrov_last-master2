package com.example.elisarus.gorodvetrov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Button button_new_game = (findViewById(R.id.button));
        Button button_about = (findViewById(R.id.button3));
        Button button_load_game = (findViewById(R.id.button2));


       /* button_next_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random(10);

                String string = day_array[random.nextInt(10)];
                day_text.setText(string);


            }
        }); */



        button_new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent new_game = new Intent(Main_page.this, New_game.class);
                startActivity(new_game);


            }
        });


        button_load_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent load_game = new Intent(Main_page.this, Load_game.class);
                startActivity(load_game);


            }
        });


       button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent about = new Intent(Main_page.this, About_page.class);
                startActivity(about);




            }
        });

    }








}
