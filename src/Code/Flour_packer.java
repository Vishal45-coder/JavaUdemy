package Code;

public class Flour_packer {
    public static void main(String[] args){
        System.out.println(canpack(0,5,4));
    }
    public static boolean canpack(int big,int small,int goal){
        if(big<0 && small<0 && goal<0){
            return false;
        }

        int sum1=0;
        int sum2=0;
        for (int i=0;i<=big;i++)
        {
            sum1=i*5;
            if(sum1>goal)
            {
                return false;
            }
            if(sum1==goal)
            {
                return true;
            }
            sum2=sum1;
            for(int j=1;j<=small;j++)
            {
                sum2=sum2+1;
                if(sum2==goal)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
