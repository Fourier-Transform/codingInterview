class Jz63 {
    Queue<Integer> A, B;
    
    /** initialize your data structure here. */
    public Jz63() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>((x , y) -> (y - x));
    }
    
    public void addNum(int num) {
        if(A.size() != B.size()){
            A.add(num);
            B.add(A.poll());
        }else{
            B.add(num);
            A.add(B.poll());
        }
    }
    
    public double findMedian() {
        if(A.size() == B.size()){
            return (A.peek() + B.peek())/2.0;
        }else{
            return (double)A.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */