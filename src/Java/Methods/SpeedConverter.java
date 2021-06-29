package Coding_Exersices.Methods;

public class SpeedConverter {
    // write your code here
    public static void main(String[] args){
        System.out.println(toMilesPerHour(1.5));
        printConversion(1.5);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        else{
           
            return Math.round(kilometersPerHour/1.609);
    }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid");
        }
        else{
            System.out.println(kilometersPerHour+" Km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
    
        }  
    }
}
