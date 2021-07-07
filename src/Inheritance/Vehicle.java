package Inheritance;

public class Vehicle {
    String name;
    int wheels;
    int speed;
    String colour;
    String vehicleno;
    public Vehicle(String name, int wheels, int speed, String colour, String vehicleno) 
    {
        this.name = name;
        this.wheels = wheels;
        this.speed = speed;
        this.colour = colour;
        this.vehicleno = vehicleno;
    }
    
}

class Car extends Vehicle {
    String Steering;
    String roof;
    boolean manual;

    public Car(String name, int wheels, int speed, String colour, String vehicleno, String steering, String roof, boolean manual) {
        super(name, wheels, speed, colour, vehicleno);
        Steering = steering;
        this.roof = roof;
        this.manual = manual;
    }


}

class porsche extends Car {
    
    boolean Drifting;
    
    public porsche(String name, int wheels, int speed, String colour, String vehicleno, String steering, String roof, boolean drifting,boolean manual) {
        super(name, wheels, speed, colour, vehicleno, steering, roof,manual);
        Drifting = drifting;
    }

    public void printvalues(){
        System.out.println("name: " + this.name);
        System.out.println("Colour: "+this.colour);
        System.out.println("Vehicleno: "+ this.vehicleno);
        System.out.println("Wheels: "+ this.wheels);
        System.out.println("Speed: "+ this.speed);
        System.out.println("Steering: "+ this.Steering);
        System.out.println("Roof: "+this.roof);
        System.out.println("Drifting: "+ this.Drifting);
        System.out.println("Manual: "+this.manual);
    }
   public static void main(String[] args){

       porsche p1=new porsche("711",4,180,"Blue","VDE89PY09","Power steering","Full black",true,true);
       p1.printvalues();
   }
}