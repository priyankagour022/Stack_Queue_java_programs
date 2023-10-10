class StackUsingArray {
    int size;
    int top;
    int[] arr;

    StackUsingArray(int size) {
        this.size = size;  // Use "this" keyword to refer to the instance variable
        top = -1;
        arr = new int[size];
    }

    public void push(int x) {
        if (isFull())
            System.out.println("Stack overflow");
        else {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int x = arr[top];
        top--;
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        int x = arr[top];
        return x;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Peek Element of the stack:"+st.peek());
        System.out.println("popped : "+" " +st.pop()+" ");
        System.out.println("popped : "+" " +st.pop()+" ");        
        System.out.println("popped : "+" " +st.pop()+" "); 
        System.out.println("popped : "+" " +st.pop()+" ");
        System.out.println("popped : "+" " +st.pop()+" ");       
    }
}
