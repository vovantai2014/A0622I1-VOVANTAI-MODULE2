package ss11_stack_queue.bai_tap.queue_use_circularlinkedlist;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(11);
        queue.enQueue(22);
        queue.enQueue(33);
        queue.enQueue(44);
        queue.enQueue(55);
        System.out.println(queue);
        queue.deQueue();
        queue.displayQueue();

    }
}
