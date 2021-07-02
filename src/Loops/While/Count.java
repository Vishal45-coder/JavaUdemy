package Loops.While;

public class Count {
    public static void main(String[] args){
        int count=1;
        while(count<10) 
        {
            System.out.println("Count value is "+count);
            count++;
        }

        count=0;
        while(true)
        {
            System.out.println("hi "+count);
            if(count==10)
                break;
            count++;    
        }

         
    }
    
}
