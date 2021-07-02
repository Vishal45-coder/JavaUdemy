package Loops.While;

/*
Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.


EXAMPLE INPUT/OUTPUT:

* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

* getEvenDigitSum(-22); → should return -1 since the number is negative


NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
**/

public class Even_dgit_sum {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(123456789));
    }
    
    public static int getEvenDigitSum(int num){
        if(num<0)
        {
            return -1;
        }
        int even;
        int sum=0;
        while(num>0)
        {
            even=num%10;
            num=num/10;
            if(Even_number.isEvenNumber(even)) //Instead of using another class method we can use (even%2==0) for even number
            {
                sum=sum+even;
            }
        }
        return sum;
    }
}
