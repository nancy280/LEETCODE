class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] t = path.split("/");
        for(int i = 0; i < t.length; i++) {
            if(t[i].equals(".") || t[i] == "") continue;

            if(t[i].equals("..")){ 
                if(!st.isEmpty()) st.pop(); 
            } else st.push(t[i]);
        }
        String result="";
        while(!st.isEmpty())
        {
             result="/"+st.pop()+result;
        }
        if(result.equals(""))
        result="/";
        return result;
    }
}