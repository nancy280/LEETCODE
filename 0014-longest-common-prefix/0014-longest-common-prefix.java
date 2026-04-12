class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefixUsingMatrix(prefix, strs[i]);
            if (prefix.equals("")) return "";
        }

        return prefix;
    }

    public String commonPrefixUsingMatrix(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] mat = new int[n][m];

        // Fill matrix: 1 where chars match, 0 otherwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        // Only check diagonal starting from (0,0)
        int k = 0;
        while (k < n && k < m && mat[k][k] == 1) {
            k++;
        }

        return s1.substring(0, k);
    }
}