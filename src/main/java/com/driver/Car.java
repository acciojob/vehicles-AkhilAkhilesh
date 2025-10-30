package com.driver;

public class Car extends Vehicle {
    private int wheels;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    private boolean isManual;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.isManual=isManual;
    }

   public Car(String name,boolean isManual)
   {
       super(name);
       this.isManual=isManual;
   }

    public void changeGear(int newGear){
        System.out.println("changeGear method called - The gear is changed to: " + newGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }
}
