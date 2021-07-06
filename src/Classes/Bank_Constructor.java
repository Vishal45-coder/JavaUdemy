package Classes;

public class Bank_Constructor {

    private int balance;
    private String name,AccountId,Email,Phonenumber;

    public Bank_Constructor(){
        this(1500, "Subhash", "AESR908742", "subhash123@gmail.com", "9550557927"); //this calles the another constructor with the same parameters
        System.out.println("Constructor called");
    }

    public Bank_Constructor(int balance,String name,String AccountId,String Email,String Phonenumber){
        this.balance = balance;
        this.name = name;
        this.Email=Email;
        this.AccountId=AccountId;
        this.Phonenumber=Phonenumber;

    }
    public void printvalues(){
        
        System.out.println("Customer Name : "+this.name);
        System.out.println("Account Id : "+this.AccountId);
        System.out.println("Balance : "+this.balance);
        System.out.println("Customer Email : "+this.Email);
        System.out.println("Customer Phonenumber : "+this.Phonenumber);
    }

    public void deposit(int deposit){
        this.balance=balance+deposit;
        System.out.println("deposited amount "+deposit);
        System.out.println("Total balance after deposit "+this.balance);
    }

    public void withdrawl(int withdrawl){
        System.out.println("Withdrawl amount "+withdrawl);
        if(balance<1 || withdrawl>balance){
            System.out.println("Insufficient balance");
        }
        else{
            this.balance-=withdrawl;
        }
        System.out.println("Balance "+this.balance);
    }
    public static void main(String[] args){

        Bank_Constructor Sbi1=new Bank_Constructor(); //this calls the constructor in the class with no paramters 
        Sbi1.printvalues();
        Sbi1.withdrawl(1000);
        Sbi1.deposit(89);

        System.out.println(); //To make a gap betwen different user

        Bank_Constructor Sbi2=new Bank_Constructor(1000, "Vishal", "ASERG1009087", "rinkuias1@gmail.com", "9550557927"); //This calls the constructor with same parameters
        Sbi2.printvalues();
        Sbi2.deposit(908);
        Sbi2.withdrawl(789);

    }
}


