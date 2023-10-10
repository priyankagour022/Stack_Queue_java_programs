class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data; 
       next = null;
    }
}
public class StackUsingLL {
    int size;
    Node top;
    StackUsingLL(){
        size = 0;
        top = null;
    }
    //push---using linkedlist
    public void push(int x){
       Node newNode = new Node(x);
        if(isEmpty()){
            top = newNode;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }
    //pop operation
     public int pop(){
        if(isEmpty()){
            return -1;
        }
        int x = top.data;
        top = top.next;
        size--;
        return x;


     }
    //check for underflow
    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    //size
    public int size(){
        return size;
    }
    public static void main(String[] args) {
        StackUsingLL st = new StackUsingLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.size());

        int popped = st.pop();
        System.out.println(popped);

        popped = st.pop();
        System.out.println(popped);

        popped = st.pop();
        System.out.println(popped);
        
        popped = st.pop();
        System.out.println(popped);


        

    }
}
