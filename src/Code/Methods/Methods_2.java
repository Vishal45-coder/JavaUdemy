package Code.Methods;

public class Methods_2 {
	public static void main(String[] args) 

	{
		Caluclate(20.909,65.90);  //It runs the Caluclate() method

	}

	public static void Caluclate(double num1, double num2) //this is a void method so it doesn't return anything
	{ 
		double add=num1+num2;
		double sub=num1-num2;
		double mul=num1*num2;
		double div=num1/num2;
		System.out.println("For nums  "+num1+" and "+num2);
		System.out.println("Addition = "+add);
		System.out.println("Substraction = "+sub);
		System.out.println("Multiplication = "+mul);
		System.out.println("Division = "+div);
	}

}
