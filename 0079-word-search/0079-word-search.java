class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visit = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(dfs(board, word, i, j, 0, visit)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visit) {
        if(index == word.length()) return true;

        // boundary + mismatch + visited
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length
           || visit[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visit[i][j] = true;

        boolean found =
            dfs(board, word, i+1, j, index+1, visit) ||
            dfs(board, word, i-1, j, index+1, visit) ||
            dfs(board, word, i, j+1, index+1, visit) ||
            dfs(board, word, i, j-1, index+1, visit);

        visit[i][j] = false; // backtrack
        return found;
    }
}