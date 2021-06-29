package Code;
import java.util.Scanner;

public class Loops_2{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int num1=0;
            int evennum=2;
            int even=0;
            int n1=0;
            while(n1 < n){
                if(n1==0){
                    num1=a+b;
                    System.out.print(num1+" ");
                    n1++;
                }
                else{
                    even=evennum*b;
                    num1=num1+even;
                    System.out.print(num1+" ");
                    evennum*=2;
                    n1++;
                }
         }

       

        }
        in.close();
    }

}