class MinStack {

    /** initialize your data structure here. */
    List<Integer> stack;
    int minValue;
    public MinStack() {
        stack=new ArrayList<Integer>();
        minValue=Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x < minValue) {
            minValue=x;
        }
        stack.add(x);
    }
    
    public void pop() {
          updateMinValue(stack.get(stack.size()-1));  
          stack.remove(stack.size()-1);
    }
    
    public int top() {
         return stack.get(stack.size()-1);
    }
    
    public int getMin() {
          return minValue; 
    }
    public void updateMinValue(int popElement) {
        if(minValue==popElement) {
         minValue=Integer.MAX_VALUE;
        for(int i=0;i<stack.size()-1;i++) {
            if(stack.get(i) < minValue) {
                minValue=stack.get(i);
            }
          }
        }    
    }
   
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */