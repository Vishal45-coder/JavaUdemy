package Loops.For;

public class Sum_3_and_5 {
    public static void main(String[] args){
    int count=0;
    int sum=0;
    for (int i=1;i<1000;i++){
        if(i%3==0 && i%5==0)
        {
            sum=sum+i;
            System.out.println("divisible by both 3 and 5 : "+i);
            count++;
        }
        if(count==5)
        {
            break;
        }
    }
    System.out.println("Sum of all the numbers : "+sum);
    }
    
}
