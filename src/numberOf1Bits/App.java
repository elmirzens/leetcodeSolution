package numberOf1Bits;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.hammingWeight(00000000000000000000000000001011) );
    }
    public int hammingWeight(int n) {
        String s = String.valueOf( n );
        System.out.println(s);
        return n;
    }
}
