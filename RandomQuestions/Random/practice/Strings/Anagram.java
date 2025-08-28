package RandomQuestions.Random.practice.Strings;

public class Anagram {
    public static void main(String[] args) {
        
        String s1 = "sun";
        String s2 = "uns";

        System.out.println(isAnagram(s1,s2));
    }

    static boolean isAnagram(String s1 , String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }

        int a[] = new int [256];

        for(int i = 0 ; i < s1.length() ; i++)
        {
             a[s1.charAt(i)]++;
             a[s2.charAt(i)]--;
        }

        for(int i : a)
        {
            if(i!=0)
              return false;
        }

        return true;
    }
}
