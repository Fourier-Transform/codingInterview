import java.util.*;
public class Solution {
    char[] set;
    Queue<Character> queue;
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(set[ch] == 0){
            set[ch]++;
            queue.add(ch);
        }else if(set[ch] != 0){
            set[ch]++;
            queue.add(ch);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while(!queue.isEmpty()){
            if(set[queue.peek()] == 1){
                return queue.peek();
            }else{
                queue.poll();
            }
        }
        return '#';
    }
    
    public Solution(){
        set = new char[128];
        queue = new LinkedList<>();
    }
}