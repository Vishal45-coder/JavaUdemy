package Encapsulaton_;

public class Enhanced_Player {

    //Here we are making these things private so they cannot be accesed from other classes
    //Protecting the members from other to manipulate
    private String name;
    private int health;
    private String weapon;


    public Enhanced_Player(String name, int health, String weapon) {
        this.name = name;
        this.health = (health<0 && health>100) ?null :health;
        this.weapon = weapon;
    }
    
    public void loseHealth(int damage){
        this.health-= damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
        }
    }

    public void healthRemaining(){
        System.out.println("Remaining health: " + this.health);
    }

    public int getHealth() {
        return health;
    }
        
	public String getName() {
		return name;
	}

	public String getWeapon() {
		return weapon;
	}

    public static void main(String[] args){

        Enhanced_Player player1 = new Enhanced_Player("Vishal",100,"sword");

        System.out.println("Name : "+player1.getName());
        System.out.println("Health : "+player1.getHealth());
        System.out.println("Weapon : "+player1.getWeapon());
        
        player1.loseHealth(20);
        player1.healthRemaining();
        player1.loseHealth(80);
        player1.healthRemaining();
    }
}
