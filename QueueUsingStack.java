import java.util.Stack;
public class QueueUsingStack {
     static Stack<Integer> st1 = new Stack<>();
     static Stack<Integer> st2 = new Stack<>();
   
    public static void push(int x){
       st1.push(x);
    }

    public static int pop(){
        if(!st2.isEmpty()){
            return st2.pop();
        }
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
       
       
       
    }
     public static void main(String[] args) {
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);

    System.out.println(pop());
    System.out.println(pop());
    System.out.println(pop());
    System.out.println(pop());


    }
   
}
