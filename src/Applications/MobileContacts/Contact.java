package Applications.MobileContacts;

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createConact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
}
}
