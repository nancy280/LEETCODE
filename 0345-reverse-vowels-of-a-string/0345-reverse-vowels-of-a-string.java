class Solution {
    public String reverseVowels(String s) {

        int i=0;
        int j=s.length()-1;
        String ch="aeiouAEIOU";
        char news[]=s.toCharArray();
        while(i<j)
        {
            if(ch.indexOf(news[i])==-1)
            {
                i++;
            }
            else if(ch.indexOf(news[j])==-1)
            {
                j--;
            }
            if(ch.indexOf(news[i])!=-1 && ch.indexOf(news[j])!=-1)
            {
                char temp=news[i];
                news[i]=news[j];
                news[j]=temp;
                i++;
                j--;
            }
        }
        return new String(news);
    }
}