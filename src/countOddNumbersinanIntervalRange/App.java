package countOddNumbersinanIntervalRange;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.countOdds( 327296043, 769434803 ) );
        //221069381
    }
    public int countOdds(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i%2==1) {
                count++;
            }
        }
        return count;
    }
}
