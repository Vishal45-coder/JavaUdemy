package Classes;

public class Simple_Caluclator {
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return secondNumber+firstNumber;
    }

    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
   
    public double getMultiplicationResult(){
        return secondNumber*firstNumber;
    }

    public double getDivisionResult(){
        if(secondNumber==0){
            return 0;
        }
        return firstNumber/secondNumber;
    }

   
    
}

class Caluclation{
    
    public static void main(String[] args){
        

        Simple_Caluclator calculator=new Simple_Caluclator();

     
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(21);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
            
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        
    }

}
