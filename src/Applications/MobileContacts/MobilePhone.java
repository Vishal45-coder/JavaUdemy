package Applications.MobileContacts;

import java.util.ArrayList;

public class MobilePhone {
    String myNumber;
    ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("My contact is already there");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void updateContact(Contact oldContact,Contact newContact ){
        int foundposition=findContact(oldContact);
        if(foundposition<0){
            System.out.println(oldContact.getName()+" is  not present ");
        }
        else{
            myContacts.set(foundposition, newContact);
            System.out.println("Contact Updated");
        }
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position=findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact){
        int foundposition=findContact(contact);
        if(foundposition<0){
            System.out.println(contact.getName()+" was not found");
            return false;
        }
        myContacts.remove(foundposition);
        System.out.println(contact.getName()+" was deleted");
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0;i<myContacts.size();i++){
            Contact contact=this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        System.out.println("Contacts List");
        System.out.println(myContacts);
        for(int i=0;i<myContacts.size();i++){
            System.out.println("Name : "+this.myContacts.get(i).getName()+" PhoneNumber : "+this.myContacts.get(i).getPhoneNumber());
        }
    }
}
