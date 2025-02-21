class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<Character>();
        int i=0;
        for(;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                st.push(word.charAt(i));
                break;
            }
            st.push(word.charAt(i));
        }
        String newstr="";
        
        while(!st.isEmpty()){
        newstr += st.pop();}

        if(i==word.length())
        return word;
        
        newstr+=word.substring(i+1);

        return newstr;
    }
}