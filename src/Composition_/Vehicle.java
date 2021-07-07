package Composition_;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Car {

    private int doors,enginecapacity;
    Vehicle theVehicle;
    
    

    public Car(int doors, int enginecapacity, Vehicle theVehicle) {
        this.doors = doors;
        this.enginecapacity = enginecapacity;
        this.theVehicle = theVehicle;
    }

    public Vehicle getVehicle() {
        return theVehicle;
    }

    public int getDoors() {
        return doors;
    }

    public int getEnginecapacity() {
        return enginecapacity;
    }

    public String getName() {
        return "porsche1";
    }

}

class Car_values{

    public static void main(String[] args) {
        String name1;

        Vehicle vehicle =new Vehicle("porsche");

        Car car= new Car(4,1500,vehicle);

        /*
        car object will go to the method getVehicle() in Car class and it will return object of Vehicle and Vehicle object will go to method getName() in Vehicle class
        **/

        name1=car.getVehicle().getName(); 
        System.out.println(name1);

        /*
        car object will go to the getName() method in Car method
        **/
        name1=car.getName();
        System.out.println(name1);

    }
}