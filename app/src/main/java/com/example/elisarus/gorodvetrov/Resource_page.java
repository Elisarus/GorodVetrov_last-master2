package com.example.elisarus.gorodvetrov;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Resource_page extends AppCompatActivity  {
    final int btn_number = 5;
   final int resource_number_items = 5;

int[] price_text = new int[resource_number_items];

    public void load_game1(){

        TextView[] textViews = new TextView[resource_number_items];
        int l = 0;
        for (int i = 0; i<resource_number_items; i++) {
            int id = getResources().getIdentifier("price" + l, "id", getPackageName());
            textViews[i] = findViewById(id);
            l++;
        }

        int k = 0;
        SharedPreferences[] load_game = new SharedPreferences[resource_number_items];
        for(int i = 0; i<resource_number_items; i++) {
            load_game[i] = getSharedPreferences("price" + k, 0);
            k++;
        }

        for (int i =0; i<resource_number_items; i++){
            price_text[i] = load_game[i].getInt("price_int"+i, 0);


        }

    }

    public void update_page(){

        TextView[] textViews = new TextView[resource_number_items];
        int l = 0;
        for (int i = 0; i<resource_number_items; i++) {
            int id = getResources().getIdentifier("price" + l, "id", getPackageName());
            textViews[i] = findViewById(id);
            l++;
        }



        for (int i = 0; i<resource_number_items; i++) {

            textViews[i].setText(Integer.toString(price_text[i]));
        }


    }



    public void change(int a){
        TextView[] textViews = new TextView[resource_number_items];
        int l = 0;
        for (int i = 0; i<resource_number_items; i++){
            int id = getResources().getIdentifier("price" + l, "id", getPackageName());
            textViews[i] = findViewById(id);
            l++;
        }


        switch (a){

            case 0 :

                for(int i = 0; i<resource_number_items; i++){
                    textViews[i].setText("44");
                }

                break;

            case 1 :

                for(int i = 0; i<resource_number_items; i++){
                    textViews[i].setText("36");
                }

                break;

            case 2:

                for(int i = 0; i<resource_number_items; i++){
                    textViews[i].setText("48");
                }

                break;

            case 3:

                for(int i = 0; i<resource_number_items; i++){
                    textViews[i].setText("56");
                }

                break;

            case 4:

                for(int i = 0; i<resource_number_items; i++){
                    textViews[i].setText("13");
                }

                break;

            case 5:

                for(int i = 0; i<resource_number_items; i++){
                    textViews[i].setText("10");
                }

                break;

                default:
                    for(int i = 0; i<resource_number_items; i++){
                        textViews[i].setText("22");
                    }
                    break;
        }
    }


    public void sell(int a){
        int id_price = getResources().getIdentifier("price"+a, "id", getPackageName());
        int id_having_items = getResources().getIdentifier("having_items"+a, "id", getPackageName());
        int id_input_amount_field = getResources().getIdentifier("input_amount_field"+a, "id", getPackageName());
        TextView having_items = findViewById(id_having_items);
        TextView price = findViewById(id_price);
        EditText input_amount_field = findViewById(id_input_amount_field);
        TextView wealth_int = findViewById(R.id.wealth);
        int price_int = Integer.parseInt(price.getText().toString());
        int input_amount_int = Integer.parseInt(input_amount_field.getText().toString());
        int wealth_double = Integer.parseInt(wealth_int.getText().toString());
        int having_items_int = Integer.parseInt(having_items.getText().toString());

        if (having_items_int == 0){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "У вас не хватает товара!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            wealth_int.setText(Integer.toString(wealth_double + input_amount_int*price_int));
            having_items.setText(Integer.toString(having_items_int - input_amount_int));

        }
    }



    public void findr(int a){

        int id = getResources().getIdentifier("price" + a, "id", getPackageName());
        int id2 = getResources().getIdentifier("price" + a, "id", getPackageName());
        TextView price = findViewById(id);
        TextView having_items = findViewById(id2);
    }





    public void buy(int a){

        int id_price = getResources().getIdentifier("price"+a, "id", getPackageName());
        int id_having_items = getResources().getIdentifier("having_items"+a, "id", getPackageName());
        int id_input_amount_field = getResources().getIdentifier("input_amount_field"+a, "id", getPackageName());
        TextView having_items = findViewById(id_having_items);
        TextView price = findViewById(id_price);
        EditText input_amount_field = findViewById(id_input_amount_field);
        TextView wealth_int = findViewById(R.id.wealth);
        int price_int = Integer.parseInt(price.getText().toString());
        int input_amount_int = Integer.parseInt(input_amount_field.getText().toString());
        int wealth_double = Integer.parseInt(wealth_int.getText().toString());
        int having_items_int = Integer.parseInt(having_items.getText().toString());
        if (wealth_double < price_int * input_amount_int) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Вы не можете столько купить!", Toast.LENGTH_SHORT);
            toast.show();

        } else {

            wealth_int.setText(Integer.toString(wealth_double - input_amount_int*price_int));
            having_items.setText(Integer.toString(having_items_int + input_amount_int));

        }

    }



public void fulfill(int a){

    TextView[] textViews = new TextView[resource_number_items];

    int l = 0;
    for (int i = 0; i<resource_number_items; i++){
        int id = getResources().getIdentifier("price" + l, "id", getPackageName());
        textViews[i] = findViewById(id);
        l++;
    }

    for (int i = 0; i<resource_number_items; i++) {

        int price_text = Integer.parseInt(textViews[i].getText().toString());
        textViews[i].setText(price_text / a);
    }
}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_page);
        Intent intent = getIntent();
        final int fName = Integer.parseInt(intent.getStringExtra("day_number"));          //получаем значение строки из New_game
        TextView having_items5 = findViewById(R.id.having_items5);
        having_items5.setText(Integer.toString(fName));
        change(fName);



        int g = 0;
        Button[] btn_sell = new Button[btn_number];
        for (int i = 0; i < btn_number; i++){
            int id = getResources().getIdentifier("button_sell" + g, "id", getPackageName());
            btn_sell[i] = findViewById(id);


            g++;

        }


        int k = 0;
        Button[] btn_buy = new Button[btn_number];
        for (int i = 0; i < btn_number; i++){
            int id = getResources().getIdentifier("button_buy" + k, "id", getPackageName());
            btn_buy[i] = findViewById(id);


            k++;

        }


        for(int i = 0; i < btn_number; i++){

            final int b = i;
            btn_buy[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    buy(b);
                }
            });



        }


        for(int i = 0; i < btn_number; i++){
           final int b = i;
            btn_sell[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    sell(b);
                }
            });


        }

        Button button_back = findViewById(R.id.button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView[] textViews = new TextView[5];
                int l = 0;
                for (int i = 0; i<resource_number_items; i++) {
                    int id = getResources().getIdentifier("price" + l, "id", getPackageName());
                    textViews[i] = findViewById(id);
                    l++;
                }

                int k = 0;
                SharedPreferences[] save_game = new SharedPreferences[resource_number_items];
                for(int i = 0; i<resource_number_items; i++) {
                    save_game[i] = getSharedPreferences("price" + k, Integer.parseInt(textViews[k].getText().toString()));
                    k++;
                }


                for(int i = 0; i<resource_number_items; i++) {
                    int price_int = Integer.parseInt(textViews[i].getText().toString());
                    SharedPreferences.Editor editor = save_game[i].edit();
                    editor.putInt("price_int"+i, price_int);
                    editor.apply();
                }

                Toast.makeText(getApplicationContext(), "Saved succesfully", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(Resource_page.this, New_game.class);
                startActivity(intent);


            }
        });

        final Button load_game = findViewById(R.id.load_game);

        load_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load_game1();
                update_page();


            }
        });


    }


}


