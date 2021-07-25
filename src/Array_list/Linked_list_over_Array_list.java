package Array_list;

import java.util.ArrayList;

public class Linked_list_over_Array_list {

    ArrayList<Integer> IntegerList = new ArrayList<Integer>();

    public void AddingElement() {
        IntegerList.add(1);
        IntegerList.add(3);
        IntegerList.add(4);
    }

    /**
     * Here we are inserting the element at index position1.
     * So,all the elements must be moved down to insert the element.
     * In this list it was not a problem. But when there are thousands of elements it will become a problem
     * So here Linked Lists comes into play.
     */
    public void InsertingElement(){
        IntegerList.add(1,2);
    }

    public void printArrayList() {
        System.out.println(IntegerList);
    }
    public static void main(String[] args){
        Linked_list_over_Array_list ArrayList = new Linked_list_over_Array_list();

        ArrayList.AddingElement();
        ArrayList.printArrayList();
        ArrayList.InsertingElement();
        ArrayList.printArrayList();
    }
}
