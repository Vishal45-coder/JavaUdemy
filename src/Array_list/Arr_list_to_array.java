package Array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr_list_to_array {
    ArrayList<Integer> Array1=new ArrayList<Integer>();

    public ArrayList<Integer> getArray1() {
        return Array1;
    }

    public void add(){
        Array1.add(1);
        Array1.add(2);
        Array1.add(3);
    }

    public static void main(String[] args) {

        Arr_list_to_array A=new Arr_list_to_array();
        A.add();

        //We are using here Integer class instead of int datatype is ArrayList contains value in the form of objects
        //So we can't convert objects to datatypes(int) so we use Integer class which stores Objects of type  int
        Integer[] myIntArray=new Integer[A.getArray1().size()];
        myIntArray=A.getArray1().toArray(myIntArray);
        System.out.println(Arrays.toString(myIntArray));

    }
}
