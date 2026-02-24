class Solution {
    public int reverse(int i) {
        long x = i;
        String original = x + "";
        boolean negative = false;

        if (original.startsWith("-")) {
            negative = true;
            original = original.substring(1);
        }

        String reversed = new StringBuilder(original).reverse().toString();

        long result = Long.parseLong(reversed);
        if (negative) {
            result = -result;
        }

        // 32-bit integer range check
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}