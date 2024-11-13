class Solution {
    public int[][] merge(int[][] intervals) {
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] result = new int[intervals.length][2];
        int index = 0;

        result[index] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] lastInterval = result[index];

            if (lastInterval[1] >= intervals[i][0]) {
                lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
            } else {
                index++;
                result[index] = intervals[i];
            }
        }

        return java.util.Arrays.copyOf(result, index + 1);
    }
}