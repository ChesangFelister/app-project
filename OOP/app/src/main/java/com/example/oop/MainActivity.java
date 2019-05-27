package com.example.oop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
        Car toyota=new Car("gold","toyota",4,100);
        Car ford=new Car("white","master",4,200);
        Car buggati=new Car("royal blue","x10",4,290);
        Car suv=new Car("gold","suv",4,300);
        Car bmw=new Car("red","bmw",4,270);

        toyota.hoot();
        toyota.carryGoods();
        ford.carryGoods();
        toyota.accelarate(76);
        Log.d("Car","toyota.speed "+toyota.getSpeed());
        bmw.getColor();
        Log.d("Car ",bmw.getColor());
        suv.getColor();
        Log.d("Car ",suv.getColor());

        Taxi taxi=new Taxi("yellow","toyota",4,70);
        taxi.hoot();
        taxi.stop();
        Log.d("Taxi taxi","taxi stopped at "+ taxi.getSpeed());
        Sportscar porche=new Sportscar("blue","buggati",4,250);
        buggati.accelarate(700);
        Log.d("porche","buggati.speed "+buggati.getSpeed());
        porche.hoot();
        porche.hoot("chesangggggggg");




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
