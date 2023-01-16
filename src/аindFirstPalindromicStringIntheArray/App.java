package аindFirstPalindromicStringIntheArray;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.firstPalindrome( new String[]{"abc","car","ada","racecar","cool"} ) );
        System.out.println( app.firstPalindrome( new String[]{"notapalindrome","racecar"} ) );
        System.out.println( app.firstPalindrome( new String[]{"def","ghi"} ) );
    }
    public String firstPalindrome(String[] words) {
        for (String word:words) {
            StringBuilder sb = new StringBuilder(word);
            if(word.equals( sb.reverse().toString() )){
                return word;
            }
        }
        return "";
    }
}
