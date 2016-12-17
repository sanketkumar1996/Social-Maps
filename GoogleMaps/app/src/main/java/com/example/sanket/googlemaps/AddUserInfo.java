package com.example.sanket.googlemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddUserInfo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user_info);
        Bundle extras = getIntent().getExtras();
            double lati = extras.getDouble("Lati");
            double longi = extras.getDouble("Longi");


        Toast.makeText(getApplicationContext(), "Lati : "+lati+" Longi: "+longi,Toast.LENGTH_SHORT).show();
    }



}
