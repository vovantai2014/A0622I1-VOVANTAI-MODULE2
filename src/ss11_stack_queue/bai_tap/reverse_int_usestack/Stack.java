package ss11_stack_queue.bai_tap.reverse_int_usestack;

public class Stack {
    int size;
    int top;
    int [] array;

    Stack(int n) {
        top = -1;
        size = n;
        array = new int[size];
    }

    boolean push(int x) {
        if (top >= size) {
            System.out.println("Stack da day, khong the them vao .");
            return false;
        } else {
            array[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Khong the pop");
            return 0;
        } else {
            int x = array[top--];
            return (char) x;
        }
    }

    boolean isEmpty() {
        return (top < 0);
    }
}
