package com.example.makovskyi41pilab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
     Spinner spin;
     TextView TextVi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin =  findViewById(R.id.spinner);
        TextVi=  findViewById(R.id.textVie);


    }
    public void getDescription(View v) {
     int spinerPosition=spin.getSelectedItemPosition();
        String[] albums = getResources().getStringArray(R.array.professionsDetails);
        TextVi.setText(albums[spinerPosition]);
    }
}
