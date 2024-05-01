public class Queue {
    private int []queue;
    private int front;
    private int rear;

    public Queue(int size){
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }


    void add(int data){
        if(isFull())
            System.out.println("Queue OverFlow");
        else
          queue[++rear] = data;
        if(rear==0)
            front++;

    }
    int deque(){
        int data = -1;
        if(isEmpty())
            System.out.println("Queue UnderFlow");
        else
            data =  queue[front++];

        return data;
    }

    boolean isFull(){
        return rear==queue.length-1;
    }
    boolean isEmpty(){
        return front==-1||front==rear+1;
    }

}
