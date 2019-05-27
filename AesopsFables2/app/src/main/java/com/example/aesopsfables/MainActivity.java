package com.example.aesopsfables;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFable1;
    Button btnFable2;
    Button btnFable3;
    Button btnFable4;
    Button btnFable5;
    Button btnFable6;
    Button btnFable7;
    Button btnFable8;
    Button btnFable9;
    Button btnFable10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnFable1=findViewById(R.id.btnFable1);
        btnFable2=findViewById(R.id.btnFable2);
        btnFable3=findViewById(R.id.btnFable3);
        btnFable4=findViewById(R.id.btnFable4);
        btnFable5=findViewById(R.id.btnFable5);
        btnFable6=findViewById(R.id.btnFable6);
        btnFable1=findViewById(R.id.btnFable7);
        btnFable1=findViewById(R.id.btnFable8);
        btnFable1=findViewById(R.id.btnFable9);
        btnFable1=findViewById(R.id.btnFable10);


        btnFable1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), AndroclesAnAesopsFable.class));
            }







