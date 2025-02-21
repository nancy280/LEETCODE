class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        String output="";
        for(char ch: s.toCharArray())
        {
            if(ch=='(')
            {
                if(c!=0)
                output+='(';
                c++;
            }
            else if(ch==')')
            {
                c--;
                if(c!=0)
                output+=')';
            }
        }
        return output;
    }
}