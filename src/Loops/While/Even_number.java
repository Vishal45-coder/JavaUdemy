package Loops.While;

public class Even_number {
    public static void main(String[] args){
        System.out.println(isEvenNumber(100));
        rangeofeven(-1,20);
    }
    
    public static boolean isEvenNumber(int number)
    {
        if(number%2==0 && number>0){
            return true;
        } 
        return false;
    }

    public static void rangeofeven(int start, int end){
        while(start<=end)
        {
            if(isEvenNumber(start))
            {
                System.out.println("even number "+start);
            }
            start++;
        }
    }
}
