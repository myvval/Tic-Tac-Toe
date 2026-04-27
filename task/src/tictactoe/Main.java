package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        //String parts = scanner.nextLine();
        String parts = "012345678";
        displayBoard(parts);

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
        return "";
    }


}
