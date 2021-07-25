package Linked_lists;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    private LinkedList CreatingLinkedLst() {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        return placesToVisit;
    }

    private void AddingElement(LinkedList<String> VisitPlaces) {
        VisitPlaces.add("Sydney");
        VisitPlaces.add("Melbourne");
        VisitPlaces.add("Brisbane");
        VisitPlaces.add("Perth");
        VisitPlaces.add("Canberra");
        VisitPlaces.add("Adelaide");
        VisitPlaces.add("Darwin");
    }

    private void InsertingElement(LinkedList<String> VisitPlaces) {
        VisitPlaces.add(1, "Alice Springs");
    }

    private void removingElement(LinkedList<String> Visitplaces) {
        Visitplaces.remove(3);
    }

    //We have used Iterator class to print Elements
    private void printwithIterator(LinkedList<String> VisitPlaces) {
        Iterator<String> i = VisitPlaces.iterator(); //To create an iterator object
        while (i.hasNext()) { //To check there is an element in the object  iterator
            System.out.println("Now visiting " + i.next()); //to print the element in the object iterator
        }
        System.out.println();
    }

    private void printwithListIterator(LinkedList VisitPlaces) {
        ListIterator<String> it = VisitPlaces.listIterator();
        while (it.hasNext()) {
            System.out.println("printing present element " + it.next());
        }
        System.out.println();
        //This method is only available in LinkedList.
        //It is used when we want to traverse the list from end
        while (it.hasPrevious()) {
            System.out.println("printing previous element " + it.previous());
        }
    }

    public static void main(String[] args) {
        Demo List1 = new Demo();
        LinkedList<String> places = List1.CreatingLinkedLst();
        List1.AddingElement(places);
        List1.printwithIterator(places);

        List1.InsertingElement(places);
        List1.printwithIterator(places);

        List1.removingElement(places);
        List1.printwithIterator(places);

        List1.printwithListIterator(places);
    }
}
