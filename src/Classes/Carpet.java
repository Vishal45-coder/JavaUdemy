package Classes;

//this problem is linked with floor,Calculator,Carpet
public class Carpet {
    private double cost;



    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost<0){
            this.cost = 0;
        }
        else{
        this.cost = cost;
        }    
    }

    public Carpet(double cost) {
        this.setCost(cost);
    }
    
}
