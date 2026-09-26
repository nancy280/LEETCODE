class Solution {
    public boolean canTransform(String start, String result) {
        int i=0;
        int j=0;
        int n=start.length();
        while(i<n || j<n)
        {
            while(i<n && start.charAt(i)=='X')i++;
            while(j<n && result.charAt(j)=='X')j++;
            if(j>=n || i>=n) return i>=n && j>=n;
            if(start.charAt(i)!=result.charAt(j))
            return false;
            else
            {
                if(start.charAt(i)=='L' && i<j)
                return false;
                else if(start.charAt(i)=='R' && i>j)
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}