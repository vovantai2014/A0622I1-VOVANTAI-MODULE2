package ss11_stack_queue.thuc_hanh.queue_linked_list;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.dequeue();
        queue.enqueue(20);
        queue.dequeue();
//        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeue item is : "+queue.dequeue().key);
    }
}
