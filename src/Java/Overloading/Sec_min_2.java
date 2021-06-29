package Java.Overloading;

//This is the challenge without static variable;

public class Sec_min_2 {
    public static void main(String[] args){

        System.out.println(getDuration(9)); //This will automatically print hour minutes and seconds if lyou only know total no.of seconds
    
        System.out.println(getDuration(409,23)); //This will automatically print hour minutes and seconds if you only know total no.of minutes and seconds
    
    }

    /**
     * This will return hour minutes and seconds with these parameters
     * @param minutes total no of minutes
     * @param seconds total no of seconds
     * @return It will return hour minutes and seconds in the String format if the conditions were satisfied else Invalid value
     */
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

    /**
     * This will return hour minutes and seconds with the only parameter
     * @param seconds Total no of seconds
     * @return It will return hour minutes and seconds in the String format if the conditions were satisfied else Invalid value
     */
    public static String getDuration(long seconds)
    {
        long min,sec;
        if(seconds<=0){
            return "Invalid time";
        }
        else{
            min=seconds/60;
            sec=seconds%60;
            return getDuration(min, sec); //This will go to the 1st method and return hour minutes and seconds in String format
        }

    }

}