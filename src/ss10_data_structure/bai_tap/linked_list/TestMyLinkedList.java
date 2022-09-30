package ss10_data_structure.bai_tap.linked_list;

import javax.xml.crypto.Data;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.add(1, 2);
        myLinkedList.add(2, 3);
        myLinkedList.add(3, 4);
        myLinkedList.add(4, 5);
        myLinkedList.printMyLinkedList();
        System.out.println();
        myLinkedList.addFirst(0);
        myLinkedList.printMyLinkedList();
        System.out.println();
        System.out.println(myLinkedList.indexOf(3));
        System.out.println(myLinkedList.contains(8));

    }
}
