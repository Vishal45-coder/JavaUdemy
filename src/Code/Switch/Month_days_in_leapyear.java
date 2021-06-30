package Code.Switch;

import Code.Methods.Leap_year; //Imported for LeapYear method

public class Month_days_in_leapyear {
    public static void main(String[] args){

        System.out.println(getDaysInMonth(12,2001));
     }

      public static int getDaysInMonth(int month,int year)
      {
        if(month<1 || month>12 || year>9999 || year<1)
        {
            return -1;
        }
        else
        {
            switch(month)
                {
                    case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                        return 31;
                    case 4:case 6:case 9:case 11:
                        return 30;

                    case 2:
                         if(Leap_year.isLeapYear(year)) //This will go to the method isLeapYear  return will be true or else statement will be executed
                        {
                            return 29;
                        }
                        return 28;
                    default:
                        return -1;
                }      
        }
      }
}
