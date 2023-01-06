package ex11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(1, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 3));
        System.out.println(board.makeMove(3, 2));
        System.out.println(board.makeMove(3, 2));
        System.out.println(Arrays.deepToString(board.getField()));

        board.newGame();

        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(1, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 3));
        System.out.println(board.makeMove(3, 2));
        System.out.println(board.makeMove(3, 2));
        System.out.println(Arrays.deepToString(board.getField()));
    }
}
