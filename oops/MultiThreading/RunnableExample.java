package MultiThreading;

class A implements Runnable
{
    public void run()
    {
        System.out.println("hii");
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        
        Runnable thread1 = new A();

        Thread thread2 = new Thread(thread1);

        thread2.start();


    }
}
