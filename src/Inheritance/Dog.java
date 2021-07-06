package Inheritance;

public class Dog extends Animal{

    private int eyes,legs,tail,teeth;
    private String coat;

    public Dog(String name,  int size, int weight,int eyes,int legs, int tail,int teeth,String coat) 
    {
       super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat= coat;

        System.out.println("coat :"+this.coat);
        System.out.println("tail :"+this.tail);
        System.out.println("teeth :"+this.teeth);
        System.out.println("eyes :"+this.eyes);
        System.out.println("legs :"+this.legs);
    }

    public void chew(){
        System.out.println("Dog.chew() is called");
    }

 
    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        super.eat(); //This will first call the eat method in Animal 
    }

    
    
    @Override
    public void move(int speed) {
        System.out.println(this.name + "is moving");
        super.move(1000); //This will first call the move method in Animal
    }

    public void walk(){
        System.out.println("Dog.walk() is called" );
        move(100); //This will first call the move method in dog
    }

    

    public static void main(String[] args){

        Animal a = new Animal("Viol",1,1,5,5);
        a.eat();
        a.move(25);

        System.out.println();

        Dog b = new Dog("tony", 8, 20, 2, 4, 1, 20 , "long silky");
        b.eat(); //This will first call the override eat method in dog 
        b.walk(); //This will first call the override move method in dog 
        b.chew(); //This will first call the override chew method in dog 
    }
}
