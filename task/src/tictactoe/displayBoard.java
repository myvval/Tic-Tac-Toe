package tictactoe;

public class displayBoard {
    public static void printBoard (String parts){
        for(int i = 0;i <=3;i++){
            if (i == 3 || i == 0) {
                System.out.println("---------");
                if (i == 3) continue;
            }
            System.out.printf("| %c %c %c |\n", parts.charAt(i * 3), parts.charAt((i * 3) + 1), parts.charAt((i * 3) + 2));
        }
    }
}