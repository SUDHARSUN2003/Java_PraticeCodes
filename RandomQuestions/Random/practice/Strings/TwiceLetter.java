package RandomQuestions.Random.practice.Strings;

public class TwiceLetter {
    public static void main(String[] args) {
        
        String s = "sun";
        System.out.println(twice(s));
    }

    static String twice(String s)
    {
        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i < s.length() ; i++)
        {
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
