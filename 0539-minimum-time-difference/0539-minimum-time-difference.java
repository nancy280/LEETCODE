class Solution {
    public int findMinDifference(List<String> timePoints) {
        int time[]=new int[timePoints.size()];
        for(int i=0;i<time.length;i++)
        {
            int hour= Integer.parseInt(timePoints.get(i).substring(0,2))*60;
            int min = Integer.parseInt(timePoints.get(i).substring(3));
            time[i]=hour+min;
        }
        Arrays.sort(time);

        int min=Integer.MAX_VALUE;
        for(int i=1;i<time.length;i++)
        {
            min=Math.min(time[i]-time[i-1],min);
        }
        min=Math.min(1440-time[time.length-1]+time[0], min);
        return min;
    }
}