package ru.kirill.chapter12;

import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> horizontal = new HashSet<>();
        HashSet<Character>[] boxes = new HashSet[9];
        HashSet<Character>[] column = new HashSet[9];
        for (int i = 0; i <= board.length - 1; i++) {
            boxes[i] = new HashSet<>();
            column[i] = new HashSet<>();
        }
        for (int i = 0; i<= board.length - 1; i++) {
            for (int j = 0; j <= board[i].length - 1; j++) {
                char currentChar = board[i][j];
                int numberOfBoxes = (i / 3) * 3 + (j / 3);
                if (setIsContains(boxes[numberOfBoxes], currentChar)) return false;
                if (setIsContains(column[j], currentChar)) return false;
                if (horizontal.contains(currentChar) && !new String(String.valueOf(currentChar)).equals(".")) return false;
                horizontal.add(currentChar);
                boxes[numberOfBoxes].add(currentChar);
                column[j].add(currentChar);

            }
            horizontal.clear();
        }
        return true;
    }

    private static boolean setIsContains(HashSet<Character> one, char currentChar) {
        return (one.contains(currentChar) && !new String(String.valueOf(currentChar)).equals("."));
    }
}
