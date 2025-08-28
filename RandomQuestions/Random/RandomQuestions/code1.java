package RandomQuestions.Random.RandomQuestions;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt())
         {
             int n = s.nextInt();
             System.out.println(n);
         }
         s.close();
    }
}
