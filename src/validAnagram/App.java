package validAnagram;

import java.util.*;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.isAnagram("anagram","nagaram") );
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        List<String> characters = new ArrayList<>();
        List<String> characters1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add( String.valueOf( s.charAt( i ) ) );
        }
        for (int i = 0; i < t.length(); i++) {
            characters1.add( String.valueOf( t.charAt( i ) ) );
        }
        Collections.sort( characters );
        Collections.sort( characters1 );
        int count = characters.size();
        for (int i = 0; i < count; i++) {
            if(!Objects.equals( characters.get( i ), characters1.get( i ) )){
                return false;
            }
        }
      return true;
    }
}
