package com.example.a707446.dominospizza;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by ilias afrass on 16/11/18
 **/

public class MainActivity extends AppCompatActivity {

    // TODO: Declare static variable of "String" type to identify position in Bundle

    // TODO: Declare two variable to be of a MenuPizzaFragment and IngredientPizzaFragment type

    // TODO: Declare variable of "int" type to save a position

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Call method to show fragment
    }

    //TODO: Add method to show fragment in Activity

    //TODO: implement a method to manage fragment

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        //TODO: Save position_save in Bundle when fragment is destroyed
        super.onSaveInstanceState(outState);
    }

}

