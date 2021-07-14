package Arrays_;

import java.util.Arrays;

public class Reversing_Array {

    public void reverse_array(int[] array_2){
        int[] array_3 = new int[array_2.length];
        for (int i=0;i<array_2.length;i++){
            array_3[i]=array_2[array_2.length-(i+1)];
        }
        System.out.println("Reversed array = "+Arrays.toString(array_3));
    }

    public static void main(String[] args){
        Reversing_Array Array_obj=new Reversing_Array();
        int[] array_1={1,2,3,4,5};
        System.out.println("Array = "+Arrays.toString(array_1));
        Array_obj.reverse_array(array_1);
    }
}
