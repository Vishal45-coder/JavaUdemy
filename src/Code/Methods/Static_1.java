package Code.Methods;

//Check Instance_1 class for Instance method and variables

public class Static_1 {

    private static String name;

    public Static_1( String name ) {
        Static_1.name = name;
    }
    
    public void print() {
        System.out.println("name: " +Static_1.name); 
    }

    public static void main(String[] args){
        Static_1 a = new Static_1("violet");
        Static_1 b = new Static_1("Red");

        a.print();//this print red because name is a static variable and the last updated name is red
        b.print();
    }
}
