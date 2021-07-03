package Scanners;

import java.util.Scanner;

public class Age_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your birth year");

        boolean nextvalue=sc.hasNextInt(); //This will check if it is int or not
        if (nextvalue)
        {
            int age=sc.nextInt();
            sc.nextLine();
            age=2020-age;
    
            System.out.println("Enter your name");
            String name=sc.nextLine();
    
            System.out.println("Name : "+name+"\nAge : "+age);

        }
        else{
            System.out.println("Birth is not an Integer");
        }
       
        sc.close();
    }
    
}
