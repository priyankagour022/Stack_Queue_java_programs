import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2= new LinkedList<>();

    public static void push(int x){
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
    }
    public static int pop(){
        if(q1.isEmpty())
            return -1;
        return q1.remove();
    }
    public static int front(){
        if(q1.isEmpty())
            return -1;
        return q1.peek();    
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        System.out.println(front());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
       
    }

}
