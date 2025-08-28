package RandomQuestions.Random.practice.Numbers;

public class sumPrime {
    public static void main(String[] args) {
        
        int n = 7;
        int sum =0;
        for(int i = 1 ; i<=n ;i++)
        {
              sum+=isPrime(i);
        }
        System.out.println(sum);
    }

    public static int isPrime(int n)
    {
     if(n == 1)
     {
         return 0;
     }
     for(int i =2 ; i <= n/2 ; i++)
     {
         if(n%i==0)
            return 0;
     }
 
     return n;
    }
}

