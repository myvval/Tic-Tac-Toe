package tictactoe;

import java.util.Scanner;

public class Game {

    public void gameLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean turnX = false;
        String parts = "         ";
        while (true) {
            displayBoard.printBoard(parts);
            System.out.printf("%c' s turn\n", turnX ? 'X' : 'O');
            System.out.println("Enter the coordinates for your move (e.g., 1 1):");
            int row = getValidInteger(scanner);
            int col = getValidInteger(scanner);

            if (row <1 || row >3 || col <1 || col > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            int index = (row - 1) * 3 + (col - 1);

            if (parts.charAt(index) == ' ') {

                parts = parts.substring(0, index) + (turnX ? 'X' : 'O')  + parts.substring(index + 1);
                turnX = !turnX;
            } else {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }
            if (gameState(parts).equals("Draw") || gameState(parts).equals("X wins") || gameState(parts).equals("O wins")) {
                displayBoard.printBoard(parts);
                System.out.println(gameState(parts));
                break;
        }

        }
    }


    public static int getValidInteger (Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("You should enter numbers!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public String gameState(String parts) {
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

        if (parts.contains(" ")) {
            return "Game not finished";
        } else {
            return "Draw";
        }
    }
}
