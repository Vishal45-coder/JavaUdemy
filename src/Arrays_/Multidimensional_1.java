package Arrays_;

import java.util.Scanner;

public class Multidimensional_1 {
    int i,j;
    int[][] intmultidimensionarray;

    Scanner scanner = new Scanner(System.in);

    public void valuesRowsColoumns(){
        System.out.println("Enter number of rows");    
        i=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of coloumns");    
        j=scanner.nextInt();
        scanner.nextLine();
        intmultidimensionarray= new int[i][j];
    }
 
    public void valuesMultidimensionalarray(){
        for (int i1 = 0; i1 <i;i1++){
            for (int j1 = 0;j1<j;j1++){
                System.out.print("Enter the value of intmultidimensionarray["+i1+"]["+j1+"]");
                intmultidimensionarray[i1][j1]=scanner.nextInt();
                scanner.nextLine();
            }
            System.out.println();
        }
    } 
    public void printMultidimendionalArray(){
        for (int i1 = 0; i1 <i;i1++){
            for (int j1 = 0;j1<j;j1++){
                System.out.print(intmultidimensionarray[i1][j1]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        Multidimensional_1 MultiArray=new Multidimensional_1();
        MultiArray.valuesMultidimensionalarray();
        MultiArray.printMultidimendionalArray();
        MultiArray.valuesRowsColoumns();
    }
    
}
