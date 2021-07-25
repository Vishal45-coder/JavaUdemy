package Arrays_;

import java.util.Arrays;

public class Reference_Array {

    public void Reference_variable(){
        /**
         * Here when we create a reference for a variable for primitive datatypes.
         * It will create the variable with same passed value but different addresses.
         * So, when we change variable of reference type onlt it will change the value
         */

        int myIntvalue=10; //pass by value
        int myintreferencevalue=myIntvalue; //pass by reference

        System.out.println("MyIntvalue = "+myIntvalue);
        System.out.println("Myintreferncevalue = "+myintreferencevalue);

        /**
         * When we create a reference variable of primitive type it creates the array with same values and same addresses.
         * When we change the value of the reference variable the another variable values will not be changed.
         */
        myintreferencevalue++;

        System.out.println("After changing myintreferencevalue");
        System.out.println("MyIntvalue = "+myIntvalue);
        System.out.println("Myintreferncevalue = "+myintreferencevalue+"\n");
    }

    public void Reference_Array(){
        /**
         * When we create a reference array it creates the array with same values and same addresses.
         * When we change the value of one array the array which was pointed to the same array.
         * Another array values will also be changed
         */
        int[] myintarray=new int[5];  //pass by value in array
        int[] myreferencearray=myintarray; //pass by reference in array

        System.out.println("MyIntArray = "+ Arrays.toString(myintarray));
        System.out.println("MyReferenceArray = "+ Arrays.toString(myreferencearray));

        /**
         * Here we have changed the value reference array.
         * As it points to the same address the main array value will also be changed.
         */
        myreferencearray[0]=1;

        System.out.println("After adding an element in the referencearray");
        //Here the Arrays.toString(Arrayname) will print the whole array without the for loop or Different methods
        System.out.println("MyIntArray = "+ Arrays.toString(myintarray));
        System.out.println("MyReferenceArray = "+ Arrays.toString(myreferencearray));

    }
    public static void main(String[] args){
        Reference_Array A=new Reference_Array();

        A.Reference_variable();
        A.Reference_Array();
    }
}
