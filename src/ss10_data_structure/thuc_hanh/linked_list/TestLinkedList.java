package ss10_data_structure.thuc_hanh.linked_list;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println(".............TESTING..............");
        MyLinkedList myLinkedList = new MyLinkedList(9);
//        myLinkedList.addFirst(11);
//        myLinkedList.addFirst(12);
//        myLinkedList.addFirst(13);
//
//        myLinkedList.add(4,9);
//        myLinkedList.add(4,9);
//        myLinkedList.printList();

        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.add(8,6);
        myLinkedList.printList();
    }
}
