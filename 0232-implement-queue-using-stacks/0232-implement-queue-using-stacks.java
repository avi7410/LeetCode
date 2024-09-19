class MyQueue {
    private Stack<Integer> a;
    private Stack<Integer> b;

    public MyQueue() {
        a = new Stack<Integer>();
        b = new Stack<Integer>();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        while(!a.empty()){
            b.push(a.pop());
        }
        int ans = b.peek();
        b.pop();
        while(!b.empty()){
            a.push(b.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(!a.empty()){
            b.push(a.pop());
        }
        int ans = b.peek();
        while(!b.empty()){
            a.push(b.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return a.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */