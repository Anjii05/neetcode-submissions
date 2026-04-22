class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> gt=new Stack<>();
    public MinStack() {
        
    }
    public void push(int val) {
        if(st.size()==0){
         st.push(val);
         gt.push(val);
    }else{
        st.push(val);
        if(gt.peek()<val) gt.push(gt.peek());
        else gt.push(val);
    }
    }
    public void pop() {
        if(st.size()==0)return;
        if(gt.size()==0)return;
        st.pop();
        gt.pop();

    }
    
    public int top() {
         if(st.size()==0) return -1;
        return st.peek();
    }
    
    public int getMin() {
        if(gt.size()==0)return -1;
        return gt.peek();
    }
}
