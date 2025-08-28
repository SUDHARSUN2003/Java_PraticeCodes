package RandomQuestions.Random.practice.Strings;

public class SwapString {
    public static void main(String[] args) {
        
        String s1 = "first";
        String s2 = "second";
        int l1 = s1.length() , l2 = s2.length();

        s1 = s1+s2;
        s2= s1.substring(0, l1 );
        s1 = s1.substring(l1, l1+l2);

        System.out.println("s1 : " + s1 + " , s2 : " + s2);
    }
}
