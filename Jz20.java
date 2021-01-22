public class Jz20 {

    /** initialize your data structure here. */
    Stack<Integer> A,B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    
    public void push(int x) {
        A.push(x);
        if(B.empty() || B.peek() >= x) B.push(x);
    }
    
    public void pop() {
        if(A.peek().equals(B.peek())){
            B.pop();
        }
        A.pop();
    }
    
    public int top() {
        return A.peek();
    }
    
    public int min() {
        return B.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */