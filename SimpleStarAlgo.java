public class SimpleStarAlgo{
    public static void main(String[] args) {

        int k = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("* ");  
            }
            System.out.println();
            k--;
        }   
    }
}