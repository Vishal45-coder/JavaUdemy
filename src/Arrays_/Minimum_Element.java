package Arrays_;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Element {
    private static int array_length;
    private static Scanner sc = new Scanner(System.in);

    private static int readInteger() {
        System.out.println("Enter the length of the array");
        array_length=sc.nextInt();
        sc.nextLine();
        return array_length;
    }

    private int[] readElement(){
        int[] array=new int[array_length]; //Instead of intializing here once again we can get the value from getter method

        for(int i=0; i<array_length; i++){
            System.out.println("Enter the array value of "+i);
            array[i]=sc.nextInt(); //By using this for loop we can give the value to each array element(We can use scanner class for user inputs)
            sc.nextLine();
        }
        return array;
    }

    private int findMin(int[] SortArray) {
        int min=Integer.MAX_VALUE;
            for(int i=0; i<array_length-1; i++){
                int value=SortArray[i];
                if(value<min){
                    min=value;
            }
        }
        return min;
    }
    public static void main(String[] args){

        Minimum_Element Array_1=new Minimum_Element();
        Minimum_Element.readInteger();
        int[] TotalArray=Array_1.readElement(); //It will read the elements in the array and return the array
        System.out.println("Array Values = "+Arrays.toString(TotalArray));
        System.out.println("Minimum Element in the array = "+Array_1.findMin(TotalArray)); //We will pass returned array as parameter
    }
}
