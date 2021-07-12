package Arrays;

import java.util.Scanner;

public class Array_Scanner {  

    private static int arraylength;
    private double sumofarray;

    public int getArraylength() {
        return arraylength;
    }

    public void IntializingScannerArrayMethod(){
        int[] myintarray=new int[getArraylength()]; //Instead of intializing here once again we can get the value from getter method
        
        for(int i=0; i<getArraylength(); i++){ 
            System.out.println("Enter the array value of "+i);
            myintarray[i]=sc.nextInt(); //By using this for loop we can give the value to each array element(We can use scanner class for user inputs)
            sc.nextLine();
        }
        printScannerArrayvalues(myintarray);
    }

    public void printScannerArrayvalues(int[] myint){
        for(int i=0; i<getArraylength(); i++){  //array.length gets the length of the array (sometimes we may get error when there are more or less lements than we specified)
            System.out.println("Arrayvalues["+i+"] = "+myint[i]); //by this way we can acheive the particular element of array
        }
        getAverageArray(myint);
    }
 
    public void getAverageArray(int[] myint){
        sumofarray=0;
        for(int i=0; i<getArraylength(); i++){ 
            sumofarray+=myint[i];
        }
        sumofarray=sumofarray/getArraylength();
        System.out.println("The average of array is "+sumofarray);
    }

    private  static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        Array_Scanner arr=new Array_Scanner();
        
        System.out.println("Enter the arraylength");
        arraylength=sc.nextInt();
        sc.nextLine();

        arr.IntializingScannerArrayMethod();
    }

}
