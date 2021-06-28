package Coding_Exersices;

/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
**/


public class Decimal_Comparing {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.908));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){

        int inum1=(int)(num1*1000); //we are multiplying into 1000 because we want to compare only three decimal places
        int inum2=(int)(num2*1000); 

        if(inum1==inum2){
            return true;
        }
        return false;
    }
}
