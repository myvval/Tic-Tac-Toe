package tictactoe;

import java.lang.reflect.Array;
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
        int[][] winningState = {{0,1,2}, {3,4,5}, {6,7,8},
                                {0,3,6}, {1,4,7}, {2,5,8},
                                         {0,4,8}, {2,4,6}};

        gameCheckLoop : for (int i =0;i<8;i++) { //logika funguje cely tohle prepsat, zbytecny promenne, kod zbytecne dlouho, ...
            int counterX = 0;
            int counterO = 0;
            char symbolX = 'X';
            char symbolO = 'O';
            for (int j = 0;j<3;j++) {
                if (symbolX == parts.charAt(winningState[i][j])) {
                    counterX++;
                    if (counterX == 3) {
                        System.out.println("X wins");
                        break gameCheckLoop;
                    }
                }
                if (symbolO == parts.charAt(winningState[i][j])) {
                    counterO++;
                    if (counterO == 3) {
                        System.out.println("O wins");
                        break gameCheckLoop;
                    }
                }
            }
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


}
