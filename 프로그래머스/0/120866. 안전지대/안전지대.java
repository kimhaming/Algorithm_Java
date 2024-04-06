import java.util.*;

class Solution {
    public int solution(int[][] board) {
         int safe = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int p = Math.max(0, i - 1); p <= Math.min(board.length - 1, i + 1); p++) {
                        for (int q = Math.max(0, j - 1); q <= Math.min(board[i].length - 1, j + 1); q++) {
                            if (!(p == i && q == j) && !(board[p][q] == 1)) {
                                board[p][q] = 2;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    safe++;
                }
            }
        }

        return safe;
    }
}