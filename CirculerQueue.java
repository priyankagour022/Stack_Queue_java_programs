class Queue {
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
    //Queue Empty
    public  boolean isEmpty(){
        return front == -1;
    }
    //Queue Full
    public boolean isFull(){
        return (front==0 && rear==size-1) || (front == rear+1);
    }
    //Enqueue
    public void enqueue(int x){
        if(isFull())
           System.out.println("Queue is full");
        else{
            if(front==-1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = x;
        }
    }
    //Dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % size;
        return x;
    }
}
public class CirculerQueue{
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());


    }
}
