class Queue{
     int[] arr;
     int front;
     int rear;
     int size;
    Queue(int size){
        this.size = size;
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    public  void enqueue(int x){
        if(isFull())
          System.out.println("Queue is Full");
        else{
            arr[++rear] = x;
        }
    }
    public  int dequeue(){
        if(isEmpty()){
             System.out.println("Queue is Empty");
             return -1;
        }
         
        else{
            int x = arr[++front];
            return x;
        }
    }
    public  boolean isEmpty(){
        if(front ==-1 && rear == -1)
          return true;
        return false;
    }
    public  boolean isFull(){
        if(front == size-1)
          return true;
        return false;
    }
}
public class QueueUsingArray {
    
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
    
}
