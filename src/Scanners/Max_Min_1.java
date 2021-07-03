package Scanners;

import java.util.Scanner;

public class Max_Min_1 {
    public static void main(String[] args){

        int min=0,max=0;
        int value;
        int count=0;
        boolean f=true;
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the range of numbers from 0");
        int range=sc.nextInt();
        sc.nextLine();
        while (true)
        {
            System.out.println("enter number #"+count);
            boolean check=sc.hasNextInt();
            if(check)
            {
                value=sc.nextInt();
                if(f)
                {
                    f=false;
                    min=value;
                    max=value;
                }
                if(value>max)
                {
                    max=value;
                }
                if(value<min)
                {
                    min=value;
                }
            }

            if(count==range-1)
            {
                System.out.println("minimum "+min);
                System.out.println("maximum "+max);
                break;
            }
            count++;
            sc.nextLine();
        }

        sc.close();
        
    }
    
}
