package Array_list;

import java.util.ArrayList;

public class Array_list_1 {
    /**
     * The Syntax is ArrayList<E> variablename = new ArrayList<E>();
     * where E represents the type of objects can be added
     * As ArrayList is a class to create a object of the particular class we must call a constructor(new Arraylist<E>())
     * In the Below example we can only add String objects
     */
    private ArrayList<String>  grocerylist=new ArrayList<String>();

    /**
     * We are adding the item to the grocerylist object 
     * @param item Passing the value which we want to add to the grocery list
     * Method ArrayListObject.add(itemname)
     */
    public void addGroceryItem(String item){
        grocerylist.add(item);
    }

    /**
     * We can get the size of the ArrayList object by method ArrayListObjetcname.size()
     * We can print the element in the grocerylist by using the ArrayListObjectname.get(position)
     */
    public void printGroceryList() {
        System.out.println("\nYou have "+grocerylist.size()+" items in your grocery list");
        for(int i=0;i<grocerylist.size();i++){
            System.out.println((i+1)+". "+grocerylist.get(i));
        }
        System.out.println("");
    }

    /**
     * We can modify the element name at particular postion
     * @param position Index of the element we want to modifyGroceryItem
     * @param newItem Element we want to replace at the index
     * Method ArrayListObject.set(position,newItem)
     */
    public void  modifyGroceryItem(int position,String newItem){
        grocerylist.set(position,newItem);
        System.out.println("Grocery Item at "+(position+1)+" has been modified to "+newItem);
    }

    /**
     * To remove the element from the ArrayList object
     * @param position Index of the removing element
     * Method ArrayListObjectname.remove(position)
     */
    public void removeGroceryItem(int position){
        String removeitem=grocerylist.get(position);
        System.out.println(removeitem+" is removed from your grocery list");
        grocerylist.remove(position);
    }

    /**
     * To find if the particular item was in the ArrayListObject
     * @param searchItem Element we want to search in the list
     * Method ArrayListObject.contains(searchItem) it will return in the form of boolean 
     */
    public void findItem(String searchItem){
        boolean exists= grocerylist.contains(searchItem);
        if(exists==true){
            System.out.println(searchItem+" was there in the Grocery list");
        }
        else{
            System.out.println(searchItem+" was not there in the grocery list");
        }
    }

    public static void main(String[] args){
        Array_list_1 Vishal= new Array_list_1();

        Vishal.addGroceryItem("Milk");
        Vishal.addGroceryItem("chesse");
        Vishal.addGroceryItem("Eggs");
        Vishal.addGroceryItem("Bread");

        Vishal.printGroceryList();

        Vishal.modifyGroceryItem(3,"Butter");

        Vishal.printGroceryList();

        Vishal.removeGroceryItem(3);

        Vishal.printGroceryList();

        Vishal.findItem("Eggs");
    }
}
