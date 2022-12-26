package rotateString;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.rotateString("abcde","cdeab") );

    }
    public boolean rotateString(String s, String goal) {
        boolean count = s.length()!=goal.length();
        if(count){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = goal.toCharArray();
        TreeSet<Character> characters = new TreeSet<>();
        TreeSet<Character> characters1 = new TreeSet<>();
        for (char aChar : chars) {
           characters.add( aChar );
        }
        for (char aChar : chars1) {
            characters1.add( aChar );
        }
        List<Character> characters2 = new ArrayList<>(characters);
        List<Character> characters3 = new ArrayList<>(characters1);
        int n = 0;
        char[] t = new char[characters2.size()];
        char[] k = new char[characters3.size()];
        for (int i = 0; i < t.length; i++) {
           t[i]=characters2.get( i );
        }
        for (int i = 0; i < k.length; i++) {
           k[i]=characters3.get( i );
        }

        for (char c : t) {
            if(c != k[n]) {
                return false;
            }
            n++;
        }


        return true;
    }
}
