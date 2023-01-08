package reverseWordsInAString;

public class App {

    public static void main(String[] args) {

        App app = new App();
        System.out.println( app.reverseWords( "God Ding" ) );

    }
    public String reverseWords(String s) {

        String[] words =s.split("\\s");
        StringBuilder reverseWord= new StringBuilder();
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord.append( sb.toString() ).append( " " );
        }
        return reverseWord.toString().trim();
    }

}
