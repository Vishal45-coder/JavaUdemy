package Classes;

public class Car {

    //Private memebers must be declared inside the class not in the main method
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    public static void main(String[] args){
        
        Car porsche=new Car(); //creates an object of class Car with name porsche


        porsche.doors=4;    
        porsche.wheels=4;
        porsche.model="T43";
        porsche.engine="V6 turbo Engine";
        porsche.colour="Matte black";

        System.out.println(porsche); //This will not print the data in an understandable format
        System.out.println(porsche.doors); //To print class values (Class_object_name.vaiable)
        System.out.println(porsche.wheels);
        System.out.println(porsche.model);
        System.out.println(porsche.engine);
        System.out.println(porsche.colour);
    }
}
