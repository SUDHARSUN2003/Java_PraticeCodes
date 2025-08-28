package MultiThreading;

class Human extends Thread  //Thread 1
{
    public void run()
    {
        for(int i =0 ; i< 5 ; i++)
        {
            System.out.println("Thread 1");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Animal extends Thread   //Thread 2
{
    public void run()
    {
        for(int i =5 ; i< 10 ; i++)
        {
            System.out.println("Thread 2");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MultithreadingBasic
{
    public static void main(String[] args) {
        
        Human thread1 = new Human();
        Animal thread2 = new Animal();

        thread1.start();
        thread2.start();
    }
}