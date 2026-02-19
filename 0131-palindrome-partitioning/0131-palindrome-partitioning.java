class Solution {

    private Map<String, List<List<String>>> memo = new HashMap<>();

    public List<List<String>> partition(String s) {
        // if (memo.containsKey(s)) {
        //     return memo.get(s);
        // }

        List<List<String>> result = new ArrayList<>();

        if (s.length() == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);

            if (isPalindrome(prefix)) {
                String suffix = s.substring(i);
                List<List<String>> suffixPartitions = partition(suffix);

                for (List<String> part : suffixPartitions) {
                    List<String> newList = new ArrayList<>();
                    newList.add(prefix);
                    newList.addAll(part);
                    result.add(newList);
                }
            }
        }

        memo.put(s, result);
        return result;
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
