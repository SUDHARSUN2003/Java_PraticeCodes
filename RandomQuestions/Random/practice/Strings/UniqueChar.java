package RandomQuestions.Random.practice.Strings;

public class UniqueChar {
    public static void main(String[] args) {
        
        String s = "sudharsun";
        int a[] = new int[256];

        for(int i = 0 ; i < s.length() ; i++)
        {
            a[s.charAt(i)]++;

            if(a[s.charAt(i)]==1)
              System.out.print(s.charAt(i) + " ");
        }
    }
}

