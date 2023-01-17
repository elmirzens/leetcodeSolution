package validPalindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.isPalindrome("") );
        System.out.println( app.isPalindrome("") );
    }
    public boolean isPalindrome(String s) {
        char[] array = s.toLowerCase().toCharArray();
        List<Character> characterList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderReverse = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {characterList.add( i );}
        for (char c : array) {
            for (Character character : characterList) {
                if(c == character) {stringBuilder.append( c );}}}
        char[] finish = String.valueOf( stringBuilder ).toCharArray();
        for (int i = finish.length - 1; i >= 0; i--) {stringBuilderReverse.append( finish[i] );}
        String reverse =  String.valueOf( stringBuilderReverse );
        String trues =  String.valueOf( stringBuilder );
        return Objects.equals( reverse, trues );
    }
}
