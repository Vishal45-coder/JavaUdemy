package Arrays;

import java.util.Scanner;

public class Descending_sort {
    private static int arraylength;
    
    public int getArraylength() {
        return arraylength;
    }

    /**
     * Here we are definig the array values through scanner class
     * @return the Array we have defined
     */
    public int[] IntializingScannerArrayMethod1(){
        int[] myintarray=new int[getArraylength()]; //Instead of intializing here once again we can get the value from getter method
        
        for(int i=0; i<getArraylength(); i++){ 
            System.out.println("Enter the array value of "+i);
            myintarray[i]=sc.nextInt(); //By using this for loop we can give the value to each array element(We can use scanner class for user inputs)
            sc.nextLine();
        }
        return myintarray;
    }

    /**
     * Here we will print the values of the Unsorted array
     * @param myint we will get the array passed as parameter which was returned form the above method(IntializingScannerMethod1 )
    */
    public void printUnsortArray(int[] myint){
        System.out.println("\nUnsorted Array");
        for(int i=0; i<getArraylength(); i++){  //array.length gets the length of the array (sometimes we may get error when there are more or less lements than we specified)
            System.out.println("Arrayvalues["+i+"] = "+myint[i]); //by this way we can acheive the particular element of array
        }
    }

    /**
     * Here we will sort the array values 
     * @param SortArray we will  we will get the array passed as parameter which was returned form the above method(IntializingScannerMethod1 )
    * @return Sorted array
     */
    public int[] SortArrayDescending(int[] SortArray){

        //Here we have taken flag because it will check until the loop is sorted
        boolean flag=true;
        while(flag){
            flag=false; 
            for(int i=0; i<getArraylength()-1; i++){
            if(SortArray[i]<SortArray[i+1]){
                int temp=SortArray[i];
                SortArray[i]=SortArray[i+1];
                SortArray[i+1]=temp;
                flag=true;
                }
            }
        }
        return SortArray;
    }

    /**
     * Here we will print the sorted array
     * @param SortArray We will be passed with the Sortarray  as parameter from above method(SortArrayDescending)
     */
    public void PrintSortArray(int[] SortArray){
        System.out.println("\nSorted Array");
        for(int i=0; i<getArraylength(); i++){  
            System.out.println("Arrayvalues["+i+"] = "+SortArray[i]);
        }
    }
    private  static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        Descending_sort SortArr=new Descending_sort();
        
        System.out.println("Enter the arraylength");
        arraylength=sc.nextInt();
        sc.nextLine();
        
        int[] Array1=SortArr.IntializingScannerArrayMethod1();
        SortArr.printUnsortArray(Array1);

       int[] SortArray=SortArr.SortArrayDescending(Array1);
       SortArr.PrintSortArray(SortArray);
    }
    
}
