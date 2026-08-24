class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for (int i = 1; i < n; i++) {

            if (intervals[i][0] <= result.get(result.size() - 1)[1]) {

                result.get(result.size() - 1)[1] =
                    Math.max(result.get(result.size() - 1)[1], intervals[i][1]);

            } else {
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}