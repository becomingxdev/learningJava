// public class Arrays {
//     public static void main(String[] args) {
//         String[] favMovies = new String[3];
        
//         favMovies[0] = "Bahubali";
//         favMovies[1] = "Kaithi";
//         favMovies[2] = "Leo";

//         for (int i = 0; i < favMovies.length; i++) {
//             System.out.println("My fav movie no. " + (i + 1) + " is: " + favMovies[i]);
//         }
//     }
// }




public class Arrays {
    public static void main(String[] args) {
        String[][] ticTacToeBoard = new String[3][3];

        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard.length; j++) {
                ticTacToeBoard[i][j] = "empty";
            }
        }

        ticTacToeBoard[0][0] = "X";
        ticTacToeBoard[1][1] = "O";

        for (int k = 0; k < ticTacToeBoard.length; k++) {
            for (int l = 0; l < ticTacToeBoard.length; l++) {
                System.out.print(ticTacToeBoard[k][l]);
                if (l != ticTacToeBoard.length -1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            System.out.println("---------------------");
        }
    }
}