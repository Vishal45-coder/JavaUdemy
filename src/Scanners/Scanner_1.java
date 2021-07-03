package Scanners;

import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter a value");
        
        int num1=sc.nextInt();
        sc.nextLine(); //this command is used because so that it will read remaining inout of num1

        int num2=sc.nextInt(); //This will read upto space only for input 
        sc.nextLine(); //it will read remaining value of num2 input line 

        String name=sc.next(); //if you use pnly next it will take next inout after space fro name 1 because you have only used next it will read upto space
        String name1=sc.nextLine(); //it will read remaining value of name input line 
        
        
        System.out.println("Value od sc.nextLine() is "+name);
        System.out.println("Value by sc.next() is "+name1);
        System.out.println("The value of num you entered is "+num1+" "+num2);
        
        sc.close();
    }
    
}
