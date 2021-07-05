package Classes;

public class Car_1 {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //These are getter and setter methods which must be present inside the class not in the main method
    //Set method intializes the value to the variable
    //Get methods prints the value which is passes to set method

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    
}

class Car_1_Values{
    public static void main(String[] args){

    Car_1 Audi=new Car_1();

    //This setters and getters were used because we can check the conditions of our variables like(==,<,>,Equalsto)
    
    //This calls the setmethod and sets the value to the particualr variable
    Audi.setDoors(4);
    Audi.setColour("Matte Red");
    Audi.setEngine("V4 Turbo Engine");
    Audi.setModel("R8");
    Audi.setWheels(4);

    //This calls the getmethod and returns the value which is assigned in the setmethod
    System.out.println(Audi.getDoors());
    System.out.println(Audi.getWheels());
    System.out.println(Audi.getModel());
    System.out.println(Audi.getEngine());
    System.out.println(Audi.getColour());
    
    }
}
