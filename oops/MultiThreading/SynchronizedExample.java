package MultiThreading;

class A {
    synchronized void display(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n++);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        A obj = new A(); // Shared object

        Thread t1 = new Thread(() -> obj.display(5)); // Thread using lambda
        Thread t2 = new Thread(() -> obj.display(10));

        t1.start();
        t2.start();
    }
}
