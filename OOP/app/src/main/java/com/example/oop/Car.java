package com.example.oop;

import android.util.Log;

public class Car {
    private String color;
    private  String model;
    private  int doors;
    private  int speed;

    public Car(String color, String model, int doors, int speed) {
        this.color = color;
        this.model = model;
        this.doors = doors;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void carryGoods(){
        Log.d("Car","The car is carring good");
    }
    public void hoot(){
        Log.d("Car","beeep!");

    }
    public int  accelarate(int accelaration){
        speed=speed+accelaration;
        return speed;


    }
    public int decelarate(int decelaratin){
        decelaratin=speed - decelaratin;
        return speed;

    }
    public void stop() {
        speed=0;


    }
}
