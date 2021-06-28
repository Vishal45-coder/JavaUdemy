package Coding_Exersices;


//This challenge with the help of static variable 
//For challenge without static variable check the file Sec_min_2

public class Seconds_Minutes {
    static long min;
    static long sec=24563;
    public static void main(String[] args){
        getDuration(sec);
        System.out.println(getDuration(min, sec));
    }

    public static String getDuration(long minutes,long seconds)
    {
        if(minutes>=0 && (seconds>=0 && seconds<=59)){
            long hours=minutes/60;
            min=minutes%60;
            return hours+"h "+min+"m "+sec+"s" ;
        }
        else {
            return "Invalid value";
        }
    }

    public static void getDuration(long seconds)
    {
        if(seconds<=0){
            System.out.println("Invalid time");
        }
        else{
            min=seconds/60;
            sec=seconds%60;
            System.out.println(seconds+" seconds is equal to "+min+" minutes "+sec+" seconds");
        }

    }

}
