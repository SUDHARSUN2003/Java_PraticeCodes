package RandomQuestions.Random.practice.Strings;

import java.util.HashMap;

public class WordOccurance {
    public static void main(String[] args) {
        
        String s = "hi bye hi bye okay";
        HashMap<String, Integer> occ = new HashMap<>();

        for(String i : s.split(" "))
        {
            if(occ.containsKey(i))
            {
                occ.put(i, occ.get(i)+1);
            }
            else
            {
                occ.put(i, 1);
            }
        }

        for(String i : occ.keySet())
        {
            System.out.println(i + ":" + occ.get(i));
        }

      //  System.out.println(occ);
    }
}
