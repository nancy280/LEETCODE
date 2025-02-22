class Solution {
    public String reverseVowels(String s) {

        int i=0;
        int j=s.length()-1;
        char ch[] ={'a','e','i','o','u','A','E','I','O','U'};
        char news[]=s.toCharArray();
        ArrayList<Character> ar=new ArrayList<>();
        for(char c: ch)
        {
            ar.add(c);
        }
        while(i<j)
        {
            if(!ar.contains(news[i]))
            {
                i++;
            }
            else if(!ar.contains(news[j]))
            {
                j--;
            }
            if(ar.contains(news[i]) && ar.contains(news[j]))
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