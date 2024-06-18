class Solution {
    public boolean checkPossibility(int[] arr) {
        int c=0;

		int i;
		for(i =0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				c++;
				if(i!=0 && arr[i-1]>arr[i+1])
				{
				arr[i+1]=arr[i];
				}
				if(c>1)
				{
					return false;
				}
			}
		}
		return true;
    }
}