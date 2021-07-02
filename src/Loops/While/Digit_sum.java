package Loops.While;

public class Digit_sum {
    public static void main(String[] args)
    {
         System.out.println(sumDigits(125));
    }
    
    public static int sumDigits(int n)
    {
        int sum=0;
        if(n>9)
        {
            while(n!=0)
            {
                sum=sum+n%10;
                n=n/10;
            }
            return sum;
        }
        return-1;
    }
}
