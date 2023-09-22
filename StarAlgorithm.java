public class StarAlgorithm{
    public static void main(String[] args) {
        
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("* ");
            }
            if ( j/5 == 0) System.out.println();
        }
        
    }
}