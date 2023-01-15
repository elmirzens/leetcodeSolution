package reverseWordsInString;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.reverseWords( "a good   example" ) );
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.replaceAll("^[.,\\s]+", "").split("[.,\\s]+");
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]).append( " " );
        }
        return String.valueOf( sb ).substring( 0,sb.length() - 1 );
    }
}
