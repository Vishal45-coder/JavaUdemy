package PolyMorphism;

class Car{
    private String Engine,name;
    private int cylinders,wheels;

    public Car(String name,String engine, int cylinders) {
        this.name = name;
        Engine = engine;
        this.cylinders = cylinders;
        this.wheels =4;
    }

	public String getEngine() {
		return Engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println(this.name+" Engine has started ");
    }
    
    public void accelerate(){
        System.out.println("Acceleration has started for "+this.name+" engine");
    }

    public void brake(){
        System.out.println("Brake "+this.name);
    }

    public void printvalues(){
        System.out.println("Name : "+this.getName());
        System.out.println("Engine : "+this.getEngine());
        System.out.println("Cylinders : "+this.getCylinders());
        System.out.println("Wheels : "+this.getWheels());
        System.out.println();
    }

    public void all(){
        System.out.println("this is Car class");
    }
}

class Car_1 extends Car{

    public Car_1(String name, String engine, int cylinders) {
        super(name, engine, cylinders);
    }
    
    @Override
    public void all(){
        System.out.println("this is Car_1 class");
    }
}

class Car_2 extends Car{

    public Car_2(String name, String engine, int cylinders) {
        super(name, engine, cylinders);
    }

    @Override
    public void all(){
        System.out.println("this is Car_2 class");
    }
}

class Car_3 extends Car{

    public Car_3(String name, String engine, int cylinders) {
        super(name, engine, cylinders);
    }

    public void reference(){
        System.out.println("this will be only printed through Car_c object");
    }

}

public class Cars {
    public static void main(String[] args){

        // These are all declared at runtime. So,this is called as runtime polymorphism
        Car main = new Car("Main Car","Main engine",2);
        Car a=new Car_1("Laferrari","V6 Turbo engine",4); 
        Car b=new Car_2("Bugatti veyron","V8 Turbo engine",6);
        Car c=new Car_3("Lamborghini", "V7 Turbo engine", 4);

        Car_3 d=new Car_3("Aventador", "Bull Turbo engine", 9);

        main.printvalues();
        a.printvalues();
        b.printvalues();
        c.printvalues();
        d.printvalues(); //this will be printing because it is inheritend from the Car class

        a.startEngine();
        a.accelerate();
        a.brake();

        System.out.println();
        
        d.startEngine();
        d.accelerate();
        d.brake();



//         c.reference();
//         This will show error even though we are printing it through the object method of c class
//         Because the object created using the Car_3 is the Car class object reference variable
//          So the method must be there in the parent class to access in polymorphism

        System.out.println();
        d.reference(); //This will be printed because it used creating the object created is it's own class 


//          Here it will print the methods present in the class if the method is not there in it's own class.
//          It will print the method in parent class

        System.out.println();
        main.all(); 
        a.all();
        b.all();
        c.all();
        d.all();

    }
}
