package Inheritance;

public class Fish extends Animal{

    private int gills,fins;

    public Fish(String name, int size, int weight, int gills, int fins) {

        super(name, 1,1, size, weight);
        this.gills = gills;
        this.fins = fins;
        System.out.println("Gills : " +this.gills);
        System.out.println("Fins : " +this.fins);
    }
    

    private void swim(){
        System.out.println(this.name+" is Swimming");
        super.move(30); //This will call the method in Animal class
    }
    
    public static void main(String[] args){
        Fish f= new Fish("nemo", 5, 10, 2, 2);
        f.swim();
    }
}