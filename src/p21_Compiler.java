public class p21_Compiler {
    public static void main(String [] args) {

        //ExerciseA();
        //ExerciseB();
        ExerciseC();

    }
    public static void ExerciseA(){
        int x = 1;
        while ( x < 10 ) {
            if ( x > 3) {
                System.out.println("big x");
            }
            System.out.println("Endless cycle");
        }
    }

    public static void ExerciseB(){
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }

    public static void ExerciseC(){
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }
}



