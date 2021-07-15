package Array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_1_Impro {

    Scanner scanner1 = new Scanner(System.in);

    /**
     * The Syntax is ArrayList<E> variablename = new ArrayList<E>();
     * where E represents the type of objects can be added
     * As ArrayList is a class to create a object of the particular class we must call a constructor(new Arraylist<E>())
     * In the Below example we can only add String objects
     */
    private ArrayList<String>  grocerylist=new ArrayList<String>();

    /**
     * We are adding the item to the grocerylist object
     * This method can be used when we want to add a single item
     * Method ArrayListObject.add(itemname)
     */
    public void addGroceryItem(){
        System.out.println("Enter the item name");
        grocerylist.add(scanner1.nextLine());
    }

    /**
     * This method is used to add many items to the list
     * It will call the method addGroceryItem to add the Items into the list
     */
    public void addGroceryItems(){
        System.out.println("Enter the no.of items");
        int numberOfItems=scanner1.nextInt();
        scanner1.nextLine();
        for(int i=0;i<numberOfItems;i++){
            this.addGroceryItem();
        }
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
     * We can modify the element in the list
     */
    public void modifyGroceryItem(){
        System.out.println("Enter the Item you want to modify");
        String searchItem= scanner1.nextLine();
       int position=this.findIndex(searchItem);

        if(position>=0){
            System.out.println("Enter the new item name");
            String modifyitem=scanner1.nextLine();
            grocerylist.set(position, modifyitem);
            System.out.println("Grocery Item at " + (position + 1) + " has been modified to " + modifyitem);
        }
        else {
            System.out.println(searchItem+" was not present in the list so can't be modified");
        }
    }
    /**
     * To remove the element from the ArrayList object
     * Method ArrayListObjectname.remove(position)
     */
    public void removeGroceryItem(){

        System.out.println("Enter the Item you want to remove");
        String removeitem=scanner1.nextLine();

        int position=this.findIndex(removeitem);
        System.out.println(removeitem+" is removed from your grocery list");
        grocerylist.remove(position);
    }

    /**
     * To find if the particular item was in the ArrayListObject
     * Element we want to search in the list
     * Method ArrayListObject.contains(searchItem) it will return in the form of boolean
     */
    public void findItem(){
        System.out.println("Enter the Item name to check");
        String searchItem=scanner1.nextLine();
        boolean exists= grocerylist.contains(searchItem);
        if(exists==true){
            System.out.println(searchItem+" was there in the Grocery list");
        }
        else{
            System.out.println(searchItem+" was not there in the grocery list");
    
        }
    }
   /**
    * To find Index by the name of the item
    * @param searchItem Item we want to find
    * @return Index value of the @param searchItem
    */
    public int findIndex(String searchItem){
        return grocerylist.indexOf(searchItem);
    }

    public static void main(String[] args){

        Array_list_1_Impro Vishal= new Array_list_1_Impro();
        Scanner scanner2 =new Scanner(System.in);

        boolean flag=true;
        while(flag) {
            System.out.println("\n1.To add single Item");
            System.out.println("2.To add multiple items");
            System.out.println("3.To print the grocery list");
            System.out.println("4.To modify an item");
            System.out.println("5.To reomove an item");
            System.out.println("6.To check the item is present in the list\n");
            System.out.println("Enter your option");
            int option=scanner2.nextInt();
            switch (option) {
                case 1:
                    Vishal.addGroceryItem();
                    break;
                case 2:
                    Vishal.addGroceryItems();
                    break;
                case 3:
                    Vishal.printGroceryList();
                    break;
                case 4:
                    Vishal.modifyGroceryItem();
                    break;
                case 5:
                    Vishal.removeGroceryItem();    
                case 6:
                    Vishal.findItem();    
                default:
                    System.out.println("Exiting the grocerylist");
                    flag=false;
                    break;
            }
        }
        scanner2.close();
    }
}
