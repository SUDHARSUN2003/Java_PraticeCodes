package RandomQuestions.Random.practice.Strings;

public class Palindrome {
    public static void main(String[] args) {
        
        String s = "madam";
        System.out.println(isPalindrome(s));
       }

    static boolean isPalindrome(String s)
    {
        int i =0 , j = s.length()-1;

        while(i < j)
        {
         if(s.charAt(i) == s.charAt(j))
         {
             i++;
             j--;
         }
         else
         {
             return false;
         }
    }
    return true;
}
}

