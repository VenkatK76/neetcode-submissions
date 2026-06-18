class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Rows
        for(int i=0; i<9; i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                    // System.out.println("In rows.");
                    return false;
                }
                set.add(board[i][j]);
            }
        }

        // Columns
        for(int i=0; i<9; i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<9; j++) {
                if(board[j][i] == '.') continue;
                if(set.contains(board[j][i])){
                    // System.out.println("In cols.");
                    return false;
                }
                set.add(board[j][i]);
            }
        }

        // 3x3
        for(int br=0; br<9; br+=3) {
            for(int bc=0; bc<9; bc+=3) {
                HashSet<Character> set = new HashSet<>();
                // System.out.println("Br: " + br + " Bc: " + bc);
                for(int i=br; i<=br+2; i++) {
                    for(int j=bc; j<=bc+2; j++) {
                        // System.out.println("Board[i][j]: "+  i + " " +  j);
                        if(board[i][j] == '.') continue;
                        if(set.contains(board[i][j])) {
                            // System.out.println("In box.");
                            return false;
                        }
                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
