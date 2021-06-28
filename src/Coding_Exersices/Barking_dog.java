package Coding_Exersices;

public class Barking_dog {
    public static void main(String[] args){
        boolean status=wakeup(true,4);
        System.out.println(status);
    }
    public static boolean wakeup(boolean value,int time){
        if(time>=0 && time<24)
        {
        if(value==true && (time<8 || time>22) )
        {
            return true;
        }
        return false;
     }

     return false;
}
}
