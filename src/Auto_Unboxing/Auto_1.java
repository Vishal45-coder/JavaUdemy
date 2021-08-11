package Auto_Unboxing;

import java.util.ArrayList;

public class Auto_1 {

    //ArrayList of type Integer Object
    ArrayList<Integer> intArray=new ArrayList<Integer>();

    /**
     * Here we are add Integer objects to ArrayList by wrapping the int value into Integer object
     * This is also known as Autoboxing
     * Autoboxing :- Converting primitive type to Object
     */
    public void addIntegervalues(){
        for(int i=0;i<10;i++){
            intArray.add(Integer.valueOf(i));
        }
    }

    /**
     * Here we will get the Integer objects to display
     */
    public void printIntgerObjetcs() {
        System.out.println("printing Integer objects");
        for (int i = 0; i < 10; i++) {
            System.out.println(intArray.get(i));
        }
    }

    /**
     * Here we will get int values to display as values
     * We can convert Integer objects to int values by using method Integerobject.intValue() using Unboxing
     * Unboxing:- Converting Objects to primitive types
     */
    public void printintvaluest(){
        System.out.println("Printing int values");
        for(int i=0;i<10;i++){
            System.out.println(intArray.get(i).intValue());
        }
    }


    public static void main(String[] args){

        /*
        * ArrayList<int> intArray = new ArrayList<int>();
        * This will give us a error because we cannot use primitive datatypes in the type of object
        */

        /*
        * So to create an object of integer type we use the Integer class
        * To create Integer class we use Autoboxing and Unboxing
        */

        //Long way of creating Integer Object
        //Here we can create Arraylist of int values or double values because we are using here Integer and Double classes
        //These were depriciated since 9 version(check below code)
        Integer integer = new Integer(45);
        Double doubleValue = new Double(12.098766);

        //Short way of creating Integer Object
        //Here we passed int value 90 as value but at compiletime it will rin this method Integer.valueOf(90)
        //To know this method refer to the  @addIntegervalues()
        Integer myIntvalue=90;
        Double myDoublevalue=90.0; // Compile time Double.valueOf(90.0)

        //refer to the method @addIntegervalues()
        int myint=myIntvalue; //At compile time myIntvalue.intValue()
        System.out.println(myint);

        Auto_1 Auto_boxing=new Auto_1();

        Auto_boxing.addIntegervalues();
        Auto_boxing.printIntgerObjetcs();
        Auto_boxing.printintvaluest();
    }
}
