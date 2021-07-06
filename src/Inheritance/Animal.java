package Inheritance;

public class Animal {
    
    public String name;
    private int brain,body,size,weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        
        System.out.println("Name :"+this.getName());
        System.out.println("Body :"+this.getBody());
        System.out.println("Brain :"+this.getBrain());
        System.out.println("Size :"+this.getSize());
        System.out.println("Weight :"+this.getWeight());
    }
    
    public void eat(){
        System.out.println("Animal.eat() is called");
    }

    public void move(int speed){
        System.out.println("Spped : "+speed);
    }

	public String getName() {
		return name;
	}


	public int getBrain() {
		return brain;
	}


	public int getBody() {
		return body;
	}


	public int getSize() {
		return size;
	}


	public int getWeight() {
		return weight;
	}


}
