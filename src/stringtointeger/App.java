package stringtointeger;


public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.myAtoi( "       42" ) );
    }

    public int myAtoi(String s) {
        return Integer.parseInt(s.replaceAll("[^\\d-]", ""));
    }
}
