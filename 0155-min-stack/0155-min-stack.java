class MinStack {
    Stack<Integer> st,minst;

    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty())
        minst.push(val);
        else if(minst.peek()>=val)
        {
            minst.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty())
        return;
        int a=st.pop();
        if(a==minst.peek())
        minst.pop();

    }
    
    public int top() {
        if(!st.isEmpty())
        return st.peek();
        return -1;
    }
    
    public int getMin() {
        if(!minst.isEmpty())
        return minst.peek();

        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */