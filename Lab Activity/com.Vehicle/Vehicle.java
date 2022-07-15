package com.Vehicle;

public class Vehicle {
public boolean engine;
public boolean wheels;
public String name;
public String type;

public Vehicle(boolean engine, boolean wheels, String name, String type) {
this.engine = engine;
this.wheels = wheels;
this.name = name;
this.type = type;
}
void display() {
System.out.println("Model Name: "+ name);
System.out.println("Model Type: "+ type);
}
public void Start(boolean turnON) {
if(turnON){
this.engine = true;
System.out.println("Your start your engine");
}System.out.println("Your engine is off");
}
public void Move(boolean move) {
if(move){
this.wheels = true;
System.out.println("Your vehicle is moving");
}System.out.println("Your vehicle is not moving");
}
public void Break(boolean brake) {
if(brake){
this.wheels = false;
System.out.println("Your vehicle is moving");
}System.out.println("Your vehicle is not moving");
}
public void Stop(boolean turnOFF) {
if(turnOFF){
this.engine = true;
System.out.println("Your start your engine");
}System.out.println("Your engine is off");
}
}
