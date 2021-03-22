package OOP_2.Bisiklet;

public class Bicycle {
    public  int gear;
    public  int speed;

    public  Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBrake(int dec){
        speed-=dec;
    }
    public  void speedUp(int inc){
        speed+=inc;
    }
    public  String toString(){
        return ("No of gears are: "+gear+"\n"+"speed of bic is: "+speed);
    }
}
