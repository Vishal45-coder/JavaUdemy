package Classes;

//this problem is linked with floor,Calculator,Carpet
public class Floor {
    private double width,length;

    public void setWidth(double width) {
        if(width<0){
            this.width= 0;
        }
        else{        
        this.width = width;
        }
    }

    public void setLength(double length) {
        if(length<0){
            this.length = 0;
        }
        else{
        this.length = length;
        }
    }

    public Floor(double width, double length) {
        this.setLength(length);
        this.setWidth(width);
    }
    
    public double getArea() {
        return width*length;
    }
}
