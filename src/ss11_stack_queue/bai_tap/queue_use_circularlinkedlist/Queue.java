package ss11_stack_queue.bai_tap.queue_use_circularlinkedlist;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int data){
        Node temp = new Node(data);
        if(this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }

    public Node deQueue(){
        if(this.front == null){
            return null;
        }
        Node temp = this.front;
        this.front = this.front.link;
        if(this.front == null){
            this.rear = null;
        }
        return temp;
    }
    public void displayQueue(){
        Node temp = this.front;
        do {
            System.out.print(temp.link+ " ");
            temp = temp.link;
        }while (temp!= this.front);
    }
}
