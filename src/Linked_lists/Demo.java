package Linked_lists;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    private LinkedList CreatingLinkedLst() {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        return placesToVisit;
    }
    private void AddingElement(LinkedList<String> placesToVisit){
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
    }

    private void InsertingElement(LinkedList<String> placesToVisit){
        placesToVisit.add(1,"Alice Springs");
    }

    private void removingElement(LinkedList<String> placesToVisit){
        placesToVisit.remove(3);
    }

    //We have used Iterator class to print Elements
    private void printList(LinkedList<String> placesList){
        Iterator<String> i=placesList.iterator(); //To create an iterator object
        while (i.hasNext()){ //To check there is an element in the object  iterator
            System.out.println("Now visiting "+i.next()); //to print the element in the object iterator
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Demo List1=new Demo();
        LinkedList<String> places= List1.CreatingLinkedLst();

        List1.AddingElement(places);
        List1.printList(places);

        List1.InsertingElement(places);
        List1.printList(places);

        List1.removingElement(places);
        List1.printList(places);

    }
}
