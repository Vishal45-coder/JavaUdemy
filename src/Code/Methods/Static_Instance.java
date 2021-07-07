package Code.Methods;

public class Static_Instance {

    int a; //instance variable (can be used only in instance method)
    static int b; //static variable (can be used only in both  instance method and static method and main method)

    public static void hello(){  //static method it is declared when we only want ot use static variable
        System.out.println("Hello");
        b=b+1; //static variable
        System.out.println("b in static method"+b);
    }
 
    public void instancemethod(){ //instance method
        a=a+1;                    //instance variable
        b=b+1;                    //static variable
        System.out.println("a in instance method 1 :"+a);
        System.out.println("b in instance method 1 :"+b);  
    }
    
    public void instancemethod2(){ //instance method
    
        a=a+1; //In this method a value is 0 because we are calling with new object
        b=b+1; //static variable it value is same as in the previous object

        System.out.println("a in instance method 2 :"+a);
        System.out.println("b in instance method 2 :"+b);
        }
    public static void main(String[] args){
        b=b+1;                    //static variable
        Static_Instance a= new Static_Instance();
        Static_Instance b= new Static_Instance();
        
        a.instancemethod(); //calling a instance method 1 
        
        b.instancemethod2(); //calling a in instance method 2
 
        Static_Instance.hello(); //calling a static method
        hello(); //calling a static method (another way)
    }

}
