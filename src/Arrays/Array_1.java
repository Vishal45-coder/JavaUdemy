package Arrays;

public class Array_1 {

    public void IntializingArrayMethod1(){
        int[] myintarray; //Declaring a array variable of type int 
        myintarray = new int[10]; //Defining a array a of size 10

        myintarray[0]=0; //Intializing a value 0 to the first element of the array (starts from index value 0)
        myintarray[1]=1;
        
        System.out.println(myintarray[1]); //print the value 1

        System.out.println("Print the values of first method");
        printArrayvalues(myintarray);
    }

    public void IntializingArrayMethod2(){

        double[] mydoublearray={1,2,3,4,5}; //this is a another way intializiing an array here we need not to define length of array
        System.out.println("Print the values of second method");
        printArrayvalues(mydoublearray);
    }

    public void IntializingArrayMethod3(){

        int[] myintarray=new int[10];
        for(int i=0; i<10; i++){
            myintarray[i]=i*10; //By using this for loop we can give the value to each array element(We can use scanner class for user inputs)
        }

        System.out.println("Print the values of third method");
        printArrayvalues(myintarray);
    }

    public void printArrayvalues(int[] arrayvalues){ //this will get the values from the int arrays
        for(int i=0; i<arrayvalues.length; i++){  //array.length gets the length of the array (sometimes we may get error when there are more or less lements than we specified)
            System.out.println("Arrayvalues["+i+"] = "+arrayvalues[i]); //by this way we can acheive the particular element of array
        }
    }
    //Overloading of the printArrayvalues with type double array
    public void printArrayvalues(double[] arrayvalues){ //this will get the values from the array type of double array
        for(int i=0; i<arrayvalues.length; i++){
            System.out.println("Arrayvalues["+i+"] = "+arrayvalues[i]);
            }    
    }
    public static void main(String[] args){
        Array_1 arr=new Array_1();

        arr.IntializingArrayMethod1();
        arr.IntializingArrayMethod2();
        arr.IntializingArrayMethod3();

    }
}
