class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> ar=new ArrayList<>();
        permutation(s,"",0,ar);
        return ar;
    }
    public void permutation(String s,String newstr, int i, ArrayList<String> ar)
    {
        if(newstr.length()==s.length())
        {
            ar.add(newstr);
            System.out.println(newstr);
            return;
        }
        if(Character.isLetter(s.charAt(i)))
        {
            permutation(s, newstr+s.charAt(i), i+1, ar);
            permutation(s,newstr+(char)(s.charAt(i)^32),i+1,ar);
        }
        else
        {
            permutation(s, newstr+s.charAt(i), i+1, ar);
        }
    }
}