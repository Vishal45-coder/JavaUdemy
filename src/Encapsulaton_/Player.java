package Encapsulaton_;

public class Player {

    public int health;
    public String weapon;
    public String name;

    public void loseHealth(int damage){
        this.health-= damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
        }
    }

    public void healthRemaining(){
        System.out.println("Remaining health: " + this.health);
    }
}

class Player_values {

    public static void main(String[] args) {

    Player player = new Player();
    player.name="Assasin";
    player.health=100;
    player.weapon="Sword";

    player.loseHealth(20);
    player.healthRemaining();
    player.loseHealth(80);
    player.healthRemaining();
    
    
    }
}


