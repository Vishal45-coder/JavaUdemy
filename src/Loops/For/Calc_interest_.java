package Loops.For;

public class Calc_interest_ {
    public static void main(String[] args){

        /*
        in this case we should write code every different type of interest
        **/
        System.out.println("By using only methods");
        System.out.println(calInterest(10000,2));
        System.out.println(calInterest(10000,3));
        System.out.println(calInterest(10000,4));
        System.out.println(calInterest(10000,5));

        //It decreases the code by running in the loop according to our conditions
        System.out.println("By using for loop and methods");
        for (int i=1;i<6;i++)
        {
            
            System.out.println(calInterest(10000,i));
        }
    }

    public static double calInterest(double amount, double interest)
    {
        return(amount*(interest/100));
    }

}
