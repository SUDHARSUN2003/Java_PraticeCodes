package Encapsulation;

class Bank
{
    private int pin;  // Data hiding

   
    void setPin(int pin)
    {
        this.pin = pin;
    }
    public int getPin()
    {
        return pin;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        
        Bank obj = new Bank();
        obj.setPin(1234);
        //obj.pin - not visibe error due to data hiding
        System.out.println(obj.getPin());
    }
}
