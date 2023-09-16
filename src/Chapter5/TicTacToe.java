package Chapter5;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean hasWinner = false;
        int xNum = 0;
        int oNum = 0;

        // Read the matrix
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                board[row][column] = sc.nextInt();
            }
        }
        sc.close();

        // Check each row
        for (int row = 0; row < SIZE; row++) {
            xNum = 0;
            oNum = 0;
            for (int column = 0; column < SIZE; column++) {
                if (board[row][column] == 1) {
                    xNum++;
                } else {
                    oNum++;
                }
            }
            if (xNum == SIZE || oNum == SIZE) {
                hasWinner = true;
                break;
            }
        }

        // Check each column
        if (!hasWinner) {
            for (int row = 0; row < SIZE; row++) {
                xNum = 0;
                oNum = 0;
                for (int column = 0; column < SIZE; column++) {
                    if (board[column][row] == 1) {
                        xNum++;
                    } else {
                        oNum++;
                    }
                }
                if (xNum == SIZE || oNum == SIZE) {
                    hasWinner = true;
                    break;
                }
            }
        }

        // check diagonal
        if (!hasWinner) {
            xNum = 0;
            oNum = 0;
            for (int i = 0; i < SIZE; i++) {
                if (board[i][i] == 1) {
                    xNum++;
                } else {
                    oNum++;
                }
            }
            if (xNum == SIZE || oNum == SIZE) {
                hasWinner = true;
            }
        }

        // check cross diagonal
        if (!hasWinner) {
            xNum = 0;
            oNum = 0;
            for (int i = 0; i < SIZE; i++) {
                if (board[i][SIZE - i - 1] == 1) {
                    xNum++;
                } else {
                    oNum++;
                }
            }
            if (xNum == SIZE || oNum == SIZE) {
                hasWinner = true;
            }
        }

        if (hasWinner) {
            if (oNum == SIZE) {
                System.out.println(
                        "x wins.");
            } else {
                System.out.println("o wins.");
            }
        }
    }
}
