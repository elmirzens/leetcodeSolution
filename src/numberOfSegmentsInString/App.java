package numberOfSegmentsInString;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.countSegments( ", , , ,        a, eaefa" ) );
    }

    public int countSegments(String s) {

        if (s.length() == 0) return 0;
        int count  = 0;
        String [] str = s.split(" ");
        for (String value : str) {
            if(!value.matches( "" )) {
                count++;
            }
        }
        return count;
    }
}
