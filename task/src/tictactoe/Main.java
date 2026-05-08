package tictactoe;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String parts = scanner.nextLine();
        //print 3x3 gird
        displayBoard.printBoard(parts);

        //print gameState
        System.out.println(gameState(parts));

        while (true) {
            System.out.println("Enter the coordinates for your move (e.g., 1 1):");
            Integer row = null;
            Integer col = null;
            int index = -1;
            //assign value to index, need to check if index got changed, moved check from bottom to this stacked if statement
            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();
                    if (col <= 3 && col >= 1 && row <= 3 && row >=1 ) {
                        index = (row - 1) * 3 + (col - 1);

                        if (parts.charAt(index) == '_') {

                            parts = parts.substring(0,index) + 'X' + parts.substring(index+1);
                            displayBoard.printBoard(parts);
                            break;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }

                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                } else {
                    System.out.println("You should enter numbers!");
                }
            } else {
                System.out.println("You should enter numbers!");
            }
            row = null;
            col = null;
        }


    }
    public static String gameState(String parts) {
        int[][] winningState = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}};

        int countX = 0, countO = 0;
        for (int i = 0; i < parts.length(); i++) {
            if (parts.charAt(i) == 'X') {
                countX++;
            } else if (parts.charAt(i) == 'O') {
                countO++;
            }
        }
        if ((countX-countO)>= 2 || (countO-countX)>=2) {
            return "Impossible";
        }

        boolean xWins = false;
        boolean oWins = false;


        for (int i = 0; i < winningState.length; i++) {
            char first = parts.charAt(winningState[i][0]);
            char second = parts.charAt(winningState[i][1]);
            char third = parts.charAt(winningState[i][2]);

            if (first == second && second == third) {
                switch (first) {
                    case 'X' -> xWins = true;
                    case 'O' -> oWins = true;
                }
            }
        }
        if (xWins && oWins) {return "Impossible";}
        else if (xWins) {return "X wins";}
        else if (oWins) {return "O wins";}

        if (parts.contains("_")) {
            return "Game not finished";
        } else {
            return "Draw";
        }
    }
}
