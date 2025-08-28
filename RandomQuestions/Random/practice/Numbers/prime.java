package RandomQuestions.Random.practice.Numbers;

public class prime {
    
   public static void main(String[] args) {
    
    int n = 5;
    System.out.println(isPrime(n));
   }

   public static boolean isPrime(int n)
   {
    if(n == 1)
    {
        return false;
    }
    for(int i =2 ; i <= n/2 ; i++)
    {
        if(n%i==0)
           return false;
    }

    return true;
   }
    
}
