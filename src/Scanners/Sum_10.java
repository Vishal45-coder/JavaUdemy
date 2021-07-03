package Scanners;

import java.util.Scanner;

public class Sum_10 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter range of numbers to caluclate from 1");
        int num=sc.nextInt();
        int value=0;

        
        for (int i=1;i<=num;i++)
        {
            System.out.println("Enter number #"+i);
            boolean check=sc.hasNextInt();
            
            if(check)
            {
                int value1=sc.nextInt();
                value=value+value1;
            }
            else
            {
                System.out.println("Number #"+i+" is not an int");
                break;
            }
        }
        System.out.println(value);
        sc.close();
    }
    
}
