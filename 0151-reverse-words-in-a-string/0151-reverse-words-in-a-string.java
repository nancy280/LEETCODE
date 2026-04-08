class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        s="";
        for(int i=words.length-1;i>=0;i--)
        {
            if(words[i]==""){
                continue;
            }
            else{
            words[i]=words[i].trim();
            s+=words[i]+" ";}
        }
        return s.trim();
    }
}