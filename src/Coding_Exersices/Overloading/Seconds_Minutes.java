package Coding_Exersices.Overloading;


//This challenge with the help of static variable 
//For challenge without static variable check the file Sec_min_2

public class Seconds_Minutes {
    static long min;
    static long sec=24563;
    public static void main(String[] args){

        getDuration(sec);  //This will automatically print hour minutes and seconds if lyou only know total no.of seconds
    
        System.out.println(getDuration(min, sec)); //This will automatically print hour minutes and seconds if you only know total no.of minutes and seconds

    }

     /**
     * This will return hour minutes and seconds with these parameters
     * @param minutes total no of minutes
     * @param seconds total no of seconds
     * @return It will return hour minutes and seconds in the String format if the conditions were satisfied else Invalid value
     */
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
    
    
    /**
     * This will return hour minutes and seconds with the only parameter
     * @param seconds Total no of seconds
     * @return It will return hour minutes and seconds in the String format if the conditions were satisfied else Invalid value
     */
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
