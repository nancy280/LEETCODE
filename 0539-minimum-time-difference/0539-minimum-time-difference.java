class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int time[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int hour= Integer.parseInt(timePoints.get(i).substring(0,2))*60;
            int min = Integer.parseInt(timePoints.get(i).substring(3));
            time[i]=hour+min;
        }
        Arrays.sort(time);

        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            min=Math.min(time[i]-time[i-1],min);
        }
        min=Math.min(1440-time[n-1]+time[0], min);
        return min;
    }
}