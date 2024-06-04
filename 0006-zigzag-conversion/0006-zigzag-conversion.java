
// suppose the word is paypalstring and the number of rows is 3 then after every 4th word means "payp" then "alst" then "ring" and so on now first letter of these word is in first row and then so on 

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)//if the number of rows is 1 only
            return s;
        int count=2*numRows - 2;// after how many number of letter the pattern is repeated
        String part[] = new String[numRows]; // number of rows to be created
        while(s.length()%count!=0)// if the letters cannot be divide into n number of words with length same as count then add space so that we can work on each part separately
            s+=" ";
        for(int i=0;i<s.length()/count;i++)
        {
            String word=s.substring(i*count, (i+1)*count);
            part[0]+=word.charAt(0);
            for(int j=1;j<numRows;j++)// adding letters in each row by adding first and last letter in pairs and then so on
            {
                if(j!=numRows-1)
                part[j]+=word.charAt(j)+"";
                part[j]+=word.charAt(word.length()-j)+"";
            }
        }
        String res="";
        for (int i=0;i<numRows;i++)
        {
            res+=part[i].substring(4).trim();// substring because "null" was also included and then trim to delete extra spaces
        }
        return res;
    }
}