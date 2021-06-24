public class Methods_3 {
    public static void main(String[] args){

        double[] value=Caluclate1(78.90,90.87);  // this gives more than one return method. 
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		System.out.println(value[3]);
    }
    public static double[] Caluclate1(double num1, double num2)   //this is a array function method. We can use this type of function if all the return types are same
	{
		double add=num1+num2;
		double sub=num1-num2;
		double mul=num1*num2;
		double div=num1/num2;

		double[] values=new double[4];

		values[1]=add;
		values[0]=sub;
		values[2]=mul;
		values[3]=div;
	return values;
    }   
}
