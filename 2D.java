public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] twoDArray = {
            {30},
            {300, 500},
            {3000, 5000, 5000}
        };

        // Printing the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
