class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++){
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++){
                if (board[r][j] == '.') continue;
                if (seen.contains(board[r][j])) return false;
                seen.add(board[r][j]);
            }
        }

        for (int i = 0; i < 9; i++){
            Set<Character> seen = new HashSet<>();
            for (int c = 0; c < 9; c++){
                if (board[c][i] == '.') continue;
                if (seen.contains(board[c][i])) return false;
                seen.add(board[c][i]);
            }
        }

        for (int rowSet = 0; rowSet < 3; rowSet++){
            for (int colSet = 0; colSet < 3; colSet++){
                Set<Character> seen = new HashSet<>();
                for (int r = 0; r < 3; r++){
                    for (int c = 0; c < 3; c++){
                        char value = board[rowSet*3 + r][colSet*3 + c];
                        if (value == '.') continue;
                        if (seen.contains(value)) return false;
                        seen.add(value);
                    }
                }
            }
        }
        return true;
    }
}
