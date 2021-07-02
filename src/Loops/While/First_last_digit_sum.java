package Loops.While;

public class First_last_digit_sum {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(121));
    }
    public static int sumFirstAndLastDigit(int num)
    {
        int temp=num;
        int num1=num;
        int sum=0;

        if(num1<0)
        {
            return -1;
        }
        if(num1<10)
        {
            return num1+num1;
        }     
        while(num1>0)
        {
            
            if(num1==temp)
            {
            sum=sum+(num1%10);
            }
            else if(num1<10)
            {
                sum=sum+num1;
                return sum;
            }
            num1=num1/10;
        
        }
        return sum;
    }
    
}
