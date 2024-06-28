class Solution {
    public int maxWeight(int N, int Edge[]) {
        int wt[] = new int[N];
        for (int i = 0; i < N; i++) {
            if (Edge[i] != -1) { // Ensure there is a valid exit
                wt[Edge[i]] += i;
            }
        }
        int max_wt = -1;
        int max_wt_index = -1;
        for (int i = 0; i < N; i++) {
            if (wt[i] >= max_wt) {
                max_wt = wt[i];
                max_wt_index = i;
            }
        }
        return max_wt_index;
    }
}
