package Loops.For;

public class Shared_digit {
    public static void main(String[] args){
        hasSharedDigit(12,23);
    }
    
    public static boolean hasSharedDigit(int x,int y)
    {
        if((x > 99) || (x < 10) || (y > 99) || (y < 10)) 
        {
			return false;
        }
        return ((x/10==y/10) || (x%10==y/10) || (y%10==x/10) || (y%10==x%10));
    }
}
