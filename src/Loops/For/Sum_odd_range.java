package Loops.For;

public class Sum_odd_range {
    public static void main(String[] args)
    {
        System.out.println(sumOdd(1,100));
    }
    public static boolean isOdd(int num)
    {
        if(num<1 || num%2==0)
        {
            return false;
        }
        return true;
    }
    public static int sumOdd(int start,int end)
    {
        int sum = 0;
        if(end>=start && start>0)
        {
            for (int i=start;i<=end;i++)
            {
                if(isOdd(i))
                {
                    sum=sum+i;
                }
            }
        }
        else
        {
            return -1;
        }
        return sum;    
    }
}
