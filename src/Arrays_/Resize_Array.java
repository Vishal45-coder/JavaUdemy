package Arrays_;

import java.util.Arrays;

public class Resize_Array {
    public static void main(String[] args){
        int[] Array1=new int[2];
        Array1[0]=1;
        Array1[1]=1;
        System.out.println("Before resizing an array = "+ Arrays.toString(Array1));

        /*
         * THis will resize the existing array but the values will be gone and must be copied
         * To Change it every time in bigger codebases, It will be problematic.
         * So, to encounter this problem java has created a concept called Arraylists
         **/
        Array1=new int[4];
        System.out.println("After resizing an array = "+ Arrays.toString(Array1));
    }
}
