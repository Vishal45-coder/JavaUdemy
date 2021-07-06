package Classes;

public class Bank_Account {
    private String accountId;
    private double balance;
    private String name;
    private String email;
    private String phonenumber;
    
    public String getPhonenumber() {
        if(phonenumber.length()==10){
        return phonenumber;
        }
        else{
        
                return "Invalid Phonenumber";
        }
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
}

class MyBank{
    public static void main(String[] args){

        Bank_Account Sbi=new Bank_Account();

        Sbi.setAccountId("ASER10098764");
        Sbi.setName("Vishal");
        Sbi.setEmail("rinkuias1@gmail.com");
        Sbi.setPhonenumber("955055792");
        Sbi.setBalance(100);

        System.out.println("Customer Name : "+Sbi.getName());
        System.out.println("Account Id : "+Sbi.getAccountId());
        System.out.println("Customer Email : "+Sbi.getEmail());
        System.out.println("Customer Phonenumber : "+Sbi.getPhonenumber());
        System.out.println("Balance : "+Sbi.getBalance());

        Sbi.withdrawl(200);
        Sbi.deposit(1000);
        Sbi.withdrawl(200);
    }
}
