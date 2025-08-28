package Inheritance;

class bicycle {
    
    int speed;
    int gear;

    bicycle(int speed , int gear)
    {
        this.speed = speed;
        this.gear = gear;
    }

    void speedUp()
    {
        speed+=10;
    }

    void gearUp()
    {
        gear+=1;
    }
}

class mountainBicycle extends bicycle
{
    int seatHeight;

    mountainBicycle(int speed , int gear , int seatHeight)
    {
        super(speed, gear);
        this.seatHeight = seatHeight;
    }
}

class sportsBicycle extends bicycle{

    int nitro;

    sportsBicycle(int speed , int gear , int nitro)
    {
       super(speed, gear);
       this.nitro = nitro;
    }
    
    void nitroBoost()
    {
        this.nitro+=30;
    }
    
}

public class Hierarchical {
    public static void main(String[] args) {
        
    mountainBicycle cycle1 = new mountainBicycle(50,4,100);

        System.out.println(cycle1.speed +"|"+ cycle1.gear +"|"+ cycle1.seatHeight);

        cycle1.speedUp();
        cycle1.gearUp();

        System.out.println(cycle1.speed +"|"+ cycle1.gear +"|"+ cycle1.seatHeight);

        sportsBicycle cycle2 = new sportsBicycle(20,3,88);

        System.out.println(cycle2.speed +"|"+ cycle2.gear+"|"+ cycle2.nitro);

        cycle2.nitroBoost();

        System.out.println(cycle2.nitro);

}
}
