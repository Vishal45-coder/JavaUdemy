package Applications.MobileContacts;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9550557927");

    public static void main(String[] args) {
        boolean quit=false;
        startPhone();
        printActions();

        while (!quit){
            System.out.println("Enter 6 to show available actions");
            int action=scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Shutting Dowb");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeNewContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    public static void addNewContact(){
        System.out.println("Enter new contact name");
        String name=scanner.nextLine();
        System.out.println("Enter new phone number");
        String phoneNumber=scanner.nextLine();
        Contact newContact=Contact.createConact(name,phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added "+name+" phone: "+phoneNumber);
        }

    }

    public static void updateContact(){
        System.out.println("Enter the oldContaact");
        String oldContact=scanner.nextLine();
        Contact existingContact=mobilePhone.queryContact(oldContact);

        if(existingContact==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter the new Contact name");
        String newName=scanner.nextLine();
        System.out.println("Enter new Contact PhoneNumber");
        String newPhoneNumber=scanner.nextLine();
        Contact newContact=new Contact(newName,newPhoneNumber);
        mobilePhone.updateContact(existingContact,newContact);
    }

    public static void removeNewContact(){
            System.out.println("Enter the old Contact");
            String oldContact=scanner.nextLine();
            Contact existingContact=mobilePhone.queryContact(oldContact);
            mobilePhone.removeContact(existingContact);
    }

    public static void queryContact(){
        System.out.println("Enter the oldContaact");
        String oldContact=scanner.nextLine();
        Contact existingContact=mobilePhone.queryContact(oldContact);

        if(existingContact==null){
            System.out.println("Contact not found");
            return;
        }

    }

    private static void startPhone(){
        System.out.println("phone is starting");
    }

    private static void printActions(){
        System.out.println("Avialable Actions");
        System.out.println("0.to shutdown\n" +
                " 1.to print contatcs \n" +
                "2.To add new contacts\n" +
                "3.To update exsisting contact\n" +
                "4.To remove an exsisting contact\n" +
                "5.Query a conatct\n" +
                "6.print list of avialable actions");
        System.out.println("Choose your  actions");
    }
}
