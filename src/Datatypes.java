public class Datatypes {
    /**
      * Primitive datatypes in java
      boolean,byte,char,short,int,long,float and double
      */
    public static void main(String[] args)
    {
      //int occcupies 32 bits
      int max=Integer.MAX_VALUE;
      int min=Integer.MIN_VALUE;
      System.out.println("The range of int must be between "+max+" and "+min);
      System.out.println("Underflow = "+(min-1)); //Underflow because of the number substracted from the  least value in the range of int
      System.out.println("Overflow = "+(max+1)); //Overflow because of the number addition from the  highest value in the range of int

      //byte occupies 8bits 
      byte max1=Byte.MAX_VALUE;
      byte min1=Byte.MIN_VALUE;
      System.out.println("The range of byte must be between "+max1+" and "+min1);

     //short occcupies 16 bits
      short max2=Short.MAX_VALUE;
      short min2=Short.MIN_VALUE;
      System.out.println("The range of short must be between "+max2+" and "+min2);

      //64 bits
      //long l=12L; //must indicate L at the end because default will be int
      long max3=Long.MAX_VALUE;
      long min3=Long.MIN_VALUE;
      System.out.println("The range of long must be between "+max3+" and "+min3);
     
      //64 bits
      double d=5d/3d;
      double max4=Double.MAX_VALUE;
      double min4=Double.MIN_VALUE;
      System.out.println("The range of double must be between "+max4+" and "+min4);
      System.out.println("Double d = "+d);


      //32 bits
      //float f=5.123f; //must indicate f at the end because default will be double
      float f1=5f/3f;
      float max5=Float.MAX_VALUE;
      float min5=Float.MIN_VALUE;
      System.out.println("The range of float must be between "+max5+" and "+min5);
      System.out.println("Float f1 = "+f1);
      //For precise caluclations we can use the class Bigdecimal

      //16 bits because it stores unicode characters(integer values)
      // It must be within this single quotations ''
      //It can represent 65535 types of characters
      char mychar='D'; //Only one character at a time
      char unicodes='\u0044';//represents letter D (ASCII values or unicode chars)
      System.out.println(mychar);
      System.out.println(unicodes);    

      //It can be either True or False
      boolean bf = false;
      boolean bt = true;
      System.out.println(bf+" "+bt);


      /**
       * Non-primitive datatypes.
       * String,arrays,classes
       */


       String s1="Vishal";
       System.out.println("Name: "+s1);
       s1="Name: "+s1+" Age: 19"; //we can concate the String in this format too
       System.out.println(s1);
       s1=s1+"  \u00A9"; //we can use the unicode characters in the string too
       System.out.println(s1);
       System.out.println(s1+" copyright mark"); 
       System.out.println(s1); // Immutable(we have not got the updated value of string because we havent declared it to the variable s1)
       String adding="10num";
       adding=adding+10+120.47; //it will convert all the int and doubles to the string because we are adding all to the String variable
       System.out.println(adding);  
    } 

} 