package com.ds;

import java.util.Arrays;


// here we have two ways to print the board
public class J2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        //using for loop
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                board[i][j] = '-';
            }
        }
        board[0][0]='0';
        board[1][0]='0';
        board[2][0]='0';


        // second board but the same as the first
        char[][] boardTwo = new char[][]{
                new char[]{'0','-','-'},
                new char[]{'0','-','-'},
                new char[]{'0','-','-'}
        };


        System.out.println("\nFirst board using loop");
        System.out.println(Arrays.deepToString(board));
        System.out.println("\nSecond board to print the array");
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
