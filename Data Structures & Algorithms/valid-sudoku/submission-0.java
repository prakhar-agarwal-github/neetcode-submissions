class Solution {
    public boolean validateBox(int startRow, int endRow, int startCol, int endCol, char[][] board) {
        Set<Character> seen = new HashSet<>();
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                if (board[row][col] == '.')
                    continue;

                if (seen.contains(board[row][col]))
                    return false;
                else
                    seen.add(board[row][col]);
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.')
                    continue;

                if (seen.contains(board[row][col]))
                    return false;
                else
                    seen.add(board[row][col]);
            }
        }

        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                if (board[col][row] == '.')
                    continue;

                if (seen.contains(board[col][row]))
                    return false;
                else
                    seen.add(board[col][row]);
            }
        }

        for (int sRow = 0; sRow < 9; sRow = sRow + 3) {
            int eRow = sRow + 2;

            for (int sCol = 0; sCol < 9; sCol += 3) {
                int eCol = sCol + 2;

                boolean isValid = validateBox(sRow, eRow, sCol, eCol, board);

                if (!isValid)
                    return false;
            }
        }

        return true;
    }
}
