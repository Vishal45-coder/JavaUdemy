package Loops.While;

public class Palindrome {
    public static void main(String[] args){
        isPalindrome(125);
    }
    public static boolean isPalindrome(int n){
        int sum=0;
        int num1=n;
        int r=0;
        while(n!=0)
            {
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
            if(num1==sum)
            {
                return true;
            }
            return false;
    }
    
}
