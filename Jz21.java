import java.util.ArrayList;
import java.util.Stack;

public class Jz21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int i = 0, j =0;
        Stack<Integer> stack = new Stack<>();
        while(i < pushA.length && j < popA.length){
            if(pushA[i] != popA[j]){
                stack.push(pushA[i]);
                i++;
            }else{
                stack.push(pushA[i]);
                i++;
                while(!stack.empty()){
                    if(stack.peek() == popA[j]){
                        j++;
                        stack.pop();
                    }else{
                        break;
                    }
                }
            }
        }
        if(stack.empty()) return true;
        else return false;
    }
}