public class p20_CodeMagnets {
    public static void main(String[] args) {
        int counter = 0;
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            if (x == 2) {
                System.out.print("b c");
            }

            x--;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x--;
            }
            counter++;
        }
        System.out.println("\niterations " + counter);
    }
}
