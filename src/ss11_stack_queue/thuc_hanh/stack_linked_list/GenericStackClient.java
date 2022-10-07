package ss11_stack_queue.thuc_hanh.stack_linked_list;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of String :");
        stackOfIString();
        System.out.println("2. Stack of Integer :");
        stackOfIntegers();
    }
    private static void stackOfIString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Six");
        stack.push("Five");
        stack.push("Rour");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Kich thuoc cua ngan xep sau khi them vao :" + stack.size());
        System.out.println("1.2 Xoa cac element tu ngan xep :");
        while (!stack.isEmpty()){
            System.out.println(" Stack sau khi pop :" +stack.pop());
        }
        System.out.println("Kich thuoc cua Stack sau khi xoa het :" +stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Kich thuoc cua ngan xep sau khi them vao :" +stack.size());
        System.out.println("2.2 Xoa element tu ngan xep :");
        while (!stack.isEmpty()){
            System.out.println("Stack sau khi pop :" + stack.pop());
        }
        System.out.println("Kich thuoc cua Stack sau khi xoa het :" + stack.size());
    }
}
