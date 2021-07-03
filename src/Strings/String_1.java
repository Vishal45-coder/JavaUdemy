package Strings;

public class String_1 {
    public static void main(String[] args){
        String value="2018"; 
        String value1="hi this is a String";
        System.out.println(value);
        System.out.println(value1);

        //We must not have any characters when converting from String to the numerical values
        int number=Integer.parseInt(value); //this function converts the String number into integer
        System.out.println(number);

        String doubval="90.0";
        double number2=Double.parseDouble(doubval);
        System.out.println(number2);
    
        
        String floval="90.0"; //Here we have a staring literal f inside but it will not show error because float has ending value of f.
        float number3=Float.parseFloat(floval);
        System.out.println(number3);
    }
    
}
