public class pattern1
{
    public static void main(String[] args) {
        
       // pattern01(5);
        /*1 2 3 4 5 
            2 3 4 5
              3 4 5
                4 5
                  5 */
      //  pattern02(6);

     /* 1 7 13 19 25 31 
        2 8 14 20 26 32
        3 9 15 21 27 33
        4 10 16 22 28 34
        5 11 17 23 29 35
        6 12 18 24 30 36 */

      // pattern03("PROGRAM");

       /*
        P
        PR
        PRO
        PROG
        PROGR
        PROGRA
        PROGRAM
        */

      //  pattern04(4);

        /*
            2 
            3 5
            7 11 13
            17 19 23 29
         */

        pattern05(5);

        /*
            1 
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
         */
    }

   static void  pattern01(int n)
    {
        for(int i =1 ; i<=n ;i++)
        {
            for(int j = 1 ; j <=n ;j++)
            {
                if(j>=i)
                  System.out.print(j+" ");
                
                else
                  System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern02(int n)
    {
        for(int i = 1 ; i <=n ;i++)
        {
            for(int j = i ; j<= n*n ; j+=n)
               System.out.print(j+" ");

            System.out.println();
        }
        
    }

    static void pattern03(String s)
    {
        for(int i =0 ; i < s.length() ; i++)
        {
            for(int j =0 ; j<=i ;j++)
            {
                System.out.print(s.charAt(j));
            }

            System.out.println();
        }
    }

    static void pattern04(int n)
    {
        int num = 2 ;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <=i ; j++)
            {
                while(!prime(num))
                {
                    num++;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static boolean prime(int n)
    {
        if(n<2) return false;

        for(int i = 2 ; i <= n/2 ; i++)
        {
            if(n%i == 0)
              return false;
        }
        return true;
    }

    static void pattern05(int n)
    {
        for(int i =0 ; i< n ; i++)
        {
            int num =1 ;
            for(int j = 0 ; j<=i ; j++)
            {
                System.out.print(num+" ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }
    }
}