class Solution {
    public int maximumDetonation(int[][] bombs) {
        int max = 0;

        for(int i = 0; i < bombs.length; i++)
        {
            boolean[] visited = new boolean[bombs.length];

            max = Math.max(
                detonate( bombs[i][0], bombs[i][1], bombs[i][2], i, bombs, 0, visited),
                max
            );
        }
        return max;
    }

    public static int detonate(int x,int y,int r,int index,int[][] ar,int count,boolean[] visited)
    {
        visited[index] = true;
        count++;

        for(int i = 0; i < ar.length; i++)
        {
            if(i != index && !visited[i] &&
               isIncluded(ar[i][0], ar[i][1], ar[i][2], x, y, r))
            {

                count += detonate(ar[i][0],ar[i][1],ar[i][2],i,ar,0,visited);

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