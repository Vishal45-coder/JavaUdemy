public class Meth_overload_2 {
    public static void main(String[] args){
        int i=88;
        method1(i); 
        
        /*
        this will invoke the method with double because int can be autmatically converted into double and since there is also no int method
        but if you pass double variable to int method it will give error becaus eit is not automatic type conversion
        **/

        method1(88.90); //this will normally invoke the double method
    }
    public static void method1(double num1)
    {
        System.out.println(num1);
    }
}
