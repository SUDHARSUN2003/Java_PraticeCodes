package RandomQuestions.Random.RandomQuestions;

public class ptrrn {
    public static void main(String[] args) {
    
        int n=6;
        int c = -1;
        for(int i=1 ; i < n ; i++)
        {
            for(int j = 1; j < i ; j ++)
            {
                c++;
                c++;
                System.out.print(c+" ");
                
            }
            c--;

            System.out.println();
        }
    }
    }
    // 1
    // 2 4
    // 3 5 7
    // 6 8 10 12
