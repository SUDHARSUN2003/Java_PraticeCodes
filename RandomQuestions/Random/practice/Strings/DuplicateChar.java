package RandomQuestions.Random.practice.Strings;

import java.util.HashMap;

public class DuplicateChar {
    public static void main(String[] args) {
        
        String s = "a bb ccc";

        HashMap<Character , Integer> dup = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(dup.containsKey(s.charAt(i)))
            {
                dup.put(s.charAt(i), dup.getOrDefault(dup, 1) + 1);
            }
            else
            {
                dup.put(s.charAt(i), 1);
            }
        }

        for(Character i : dup.keySet())
        {
            System.out.println(i+" "+dup.get(i));
        }
    }
}
