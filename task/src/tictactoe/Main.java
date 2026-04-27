package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        //String parts = scanner.nextLine();
        String parts = "OOOXXXXXX";
        displayBoard(parts);
        gameState(parts);
    }
    public static void displayBoard(String parts) {
        for (int i=0;i<=3;i++) {
            if (i == 3 || i == 0) {
                System.out.println("---------");
                if (i==3) continue;
            }
            System.out.printf("| %c %c %c |\n",parts.charAt(i*3),parts.charAt((i*3)+1),parts.charAt((i*3)+2));
        }
    }

    public static String gameState(String parts) {
        int[][] winningState = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}};

        checkIfSomeoneWins:
        for (int i = 0; i < winningState.length; i++) {
            char first = parts.charAt(winningState[i][0]);
            char second = parts.charAt(winningState[i][1]);
            char third = parts.charAt(winningState[i][2]);

            if ((first == 'X' || first == 'O') && first == second && second == third) {
                System.out.println(first + " wins");
            }


            int counter = 0;
            char symbol = 'a';
        /*for (int i = 0 ; i<=8;i++) {
            symbol = parts.charAt(i);
            if symbol
        }

        if(parts.contains("_")) {
            return "Game not finished";
        }
        /*else if (
        ){

        }
        else if (!parts.contains("_")) {
            return "Draw";
        }*/
            return "";


        }
        return "";
    }

}
