class Solution {
    public int maximumDetonation(int[][] bombs) {
        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
        int max = 0;

        for(int i = 0; i < bombs.length; i++)
        {
            boolean[] visited = new boolean[bombs.length];

            max = Math.max(
                detonate(arr, bombs[i][0], bombs[i][1], bombs[i][2], i, bombs, 0, visited),
                max
            );
        }
        return max;
    }

    public static int detonate(
        ArrayList<List<Integer>> arr,
        int x,
        int y,
        int r,
        int index,
        int[][] ar,
        int count,
        boolean[] visited)
    {
        visited[index] = true;
        count++;

        for(int i = 0; i < ar.length; i++)
        {
            if(i != index && !visited[i] &&
               isIncluded(ar[i][0], ar[i][1], ar[i][2], x, y, r))
            {
                arr.add(Arrays.asList(ar[i][0], ar[i][1], ar[i][2]));

                count += detonate(
                    arr,
                    ar[i][0],
                    ar[i][1],
                    ar[i][2],
                    i,
                    ar,
                    0,              
                    visited
                );

                arr.remove(Arrays.asList(ar[i][0], ar[i][1], ar[i][2]));
            }
        }

        return count;
    }

    public static boolean isIncluded(int x1, int y1, int r1,
                                     int x2, int y2, int r2)
    {
        long dx = x1 - x2;
        long dy = y1 - y2;

        return dx * dx + dy * dy <= (long) r2 * r2;
    }

}