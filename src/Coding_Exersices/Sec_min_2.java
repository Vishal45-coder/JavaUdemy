package Coding_Exersices;

//This is the challenge without static variable;

public class Sec_min_2 {
    public static void main(String[] args){
        System.out.println(getDuration(24563));
        System.out.println(getDuration(409,23));
    }

    public static String getDuration(long minutes,long seconds)
    {
        long min;
        if(minutes>=0 && (seconds>=0 && seconds<=59)){
            long hours=minutes/60;
            min=minutes%60;
            return hours+"h "+min+"m "+seconds+"s";
        }
        else {
            return "Invalid value";
        }
    }

    public static String getDuration(long seconds)
    {
        long min,sec;
        if(seconds<=0){
            return "Invalid time";
        }
        else{
            min=seconds/60;
            sec=seconds%60;
            return getDuration(min, sec);
        }

    }

}