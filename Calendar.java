public class Calendar {
    public static void main (String[] args) {
        int x = 1;
        String y = " -School";
        while (x <= 30) {
            System.out.println("September " + x + y);
            if (x == 1)
            y = " -School";
            else if (x == 4 || x == 5 || x == 11 || x == 12 || x == 18 || x == 19 || x == 25 || x == 26)
            y = " -Weekend";
            else if (x == 6)
            y = " -Labor Day";
            else if (x == 24)
            y = " -End of Marking Period";
             else 
                y = " -School";
                x++; 
        }
    }
}
