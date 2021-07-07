package Code.Methods;

//Check Static_1 class for Static methods and variables.
public class Instance_1 {

    private  String name;

    public Instance_1( String name ) {
        this.name = name;
    }
    
    public void print() {
        System.out.println("name: " + name);
    }

    public static void main(String[] args){
        Instance_1 a = new Instance_1("violet");
        Instance_1 b = new Instance_1("Red");

        a.print();//this will print vilolet only because here name is an instance variable which a seperate value to each object
        b.print();
    }
}