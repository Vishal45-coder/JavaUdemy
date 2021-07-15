package Array_list;

import java.util.ArrayList;

public class Array_list_2 {
   ArrayList<Integer> Array1=new ArrayList<Integer>();

    public ArrayList<Integer> getArray1() {
        return Array1;
    }

    public void add(){
        Array1.add(1);
        Array1.add(2);
        Array1.add(3);
    }

    public void add2(){
        Array1.add(4);
    }
    public void printRealArray1(){
        System.out.println("Real array1 = "+Array1);
    }

    public static void main(String[] args) {
        Array_list_2 A=new Array_list_2();

        A.add();
        A.printRealArray1();

        //1 method to copy the array
        ArrayList<Integer> CopyArray1=new ArrayList<Integer>(A.getArray1());
        //2 Another method to copy the array
        ArrayList<Integer> CopyArray2=new ArrayList<Integer>();
        CopyArray2.addAll(A.getArray1());

        System.out.println("Copied array1 = "+CopyArray1);
        System.out.println("Copied Array2 = "+CopyArray2);

        //Here we have added a element to the real array.It will change values only in the real array not inside the copy array
        A.add2();

        A.printRealArray1();
        System.out.println("Copied array = "+CopyArray1);
        System.out.println("Copied Array2 = "+CopyArray2);
    }
}
