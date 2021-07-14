package Arrays;

public class Array_2 {
    public static void main(String[] args){

        int myIntvalue=10; //pass by value
        int myintreferencevalue=myIntvalue; //pass by reference

        System.out.println("MyIntvalue = "+myIntvalue);
        System.out.println("Myintreferncevalue = "+myintreferencevalue);

        myintreferencevalue++;

        System.out.println("After changing myintreferencevalue");
        System.out.println("MyIntvalue = "+myIntvalue);
        System.out.println("Myintreferncevalue = "+myintreferencevalue);

    }
}
