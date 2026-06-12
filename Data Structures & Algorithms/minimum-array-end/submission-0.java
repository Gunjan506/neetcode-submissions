class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        long k = n - 1;

        for (int bit = 0; bit < 63; bit++) {

            if ((ans & (1L << bit)) == 0) {

                if ((k & 1) == 1) {
                    ans |= (1L << bit);
                }

                k >>= 1;

                if (k == 0) {
                    break;
                }
            }
        }

        return ans;
    }
}