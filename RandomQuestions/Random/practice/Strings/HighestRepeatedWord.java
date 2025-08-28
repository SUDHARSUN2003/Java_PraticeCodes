package RandomQuestions.Random.practice.Strings;

import java.util.HashMap;

public class HighestRepeatedWord {
    public static void main(String[] args) {
        
        String s = "qqttrr www eedd";
        String sp[] = s.split(" ");
        int max = 0 , ind =0 , maxi = 0 ;

        for(int j = 0 ; j < sp.length ; j++)
        {
            String st = sp[j];
            HashMap<Character , Integer> hp = new HashMap<>();
            max = 0 ;

            for(int i = 0 ; i < st.length() ; i++)
            {
                hp.put(st.charAt(i), hp.getOrDefault(st.charAt(i), 0)+1);
            }

            for(int i : hp.values())
               {
                if(i > 1)
                {
                    max++ ;
                }
               }

            if(maxi < max)
            {
                maxi = max;
                ind = j;
            }

        }

        System.out.println(sp[ind]);

    }
}
