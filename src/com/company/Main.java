package com.company;
import javasolver.Javasolver;
import javasolver.PrintSudoku;



public class Main {

    public static void main(String[] args) {

        // write your code here
        Integer[][] sudoku = {
                {0, 1, 8, 4, 7, 0, 0, 0, 0},
                {0, 9, 0, 0, 0, 0, 1, 0, 5},
                {0, 0, 3, 0, 0, 0, 0, 4, 0},
                {5, 0, 1, 0, 0, 0, 0, 0, 7},
                {6, 0, 0, 5, 2, 7, 0, 0, 3},
                {8, 0, 0, 1, 0, 0, 5, 0, 0},
                {0, 0, 2, 0, 0, 8, 0, 0, 1},
                {3, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 4, 0, 7, 3, 0}
        };
        Integer[][] sudoku2 = {
                {0, 0, 0, 5, 6, 0, 0, 0, 7},
                {0, 0, 0, 0, 0, 0, 0, 0, 8},
                {0, 4, 0, 0, 8, 0, 0, 3, 0},
                {0, 7, 9, 4, 3, 0, 0, 8, 5},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {0, 8, 3, 0, 7, 6, 2, 0, 0},
                {7, 3, 2, 0, 4, 0, 0, 0, 6},
                {4, 5, 6, 0, 2, 0, 7, 0, 9},
                {0, 0, 0, 0, 5, 7, 4, 0, 0}
        };
        Integer[][] sudoku3 = {
                {0, 0, 0, 0, 7, 1, 3, 0, 0},
                {1, 0, 8, 0, 0, 0, 0, 2, 6},
                {0, 7, 0, 2, 0, 6, 0, 9, 0},
                {5, 8, 6, 1, 0, 2, 4, 0, 0},
                {4, 3, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 7, 6, 0, 5, 0, 0},
                {0, 9, 1, 0, 0, 0, 0, 5, 0},
                {0, 4, 0, 0, 0, 0, 0, 0, 0},
                {8, 0, 0, 0, 2, 0, 0, 0, 3}
        };

        PrintSudoku.printSuDoKu(Javasolver.solver(sudoku));
    }
}

