package Classes;

public class Vip_Customer {
    String name,email;
    int creditlimit;

	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getCreditlimit() {
		return creditlimit;
	}
    
    public Vip_Customer(){
		this("Default name",45692,"default@gnmail.com"); 
	}

	public Vip_Customer(String name,int creditlimit){
		this(name, creditlimit, "unknown@gnmail.com");
		
	}
	
	public Vip_Customer(String name,int creditlimit,String email){
		this.name = name;
		this.creditlimit = creditlimit;
		this.email = email;
	}

	public void printvalues(){
		System.out.println(this.getName());
		System.out.println(this.getEmail());
		System.out.println(this.getCreditlimit());
		System.out.println();
	}
    public static void main (String[] args){
    
		Vip_Customer Customer1 = new Vip_Customer();
		Customer1.printvalues();
		
		Vip_Customer Customer2= new Vip_Customer("Subhash",1000);
		Customer2.printvalues();

		Vip_Customer Customer3= new Vip_Customer("Vishal",1000595,"Vishal@gmail.com");
		Customer3.printvalues();

	}
}
