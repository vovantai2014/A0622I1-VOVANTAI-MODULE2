package ss10_data_structure.bai_tap.array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        System.out.println("Khoi Tao Thanh Cong MyArrayList Co Kich Thuoc la :");
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) throws IllegalAccessException {
        if (capacity > 0) {
            System.out.println("Khoi Tao Thanh Cong ArrayList Co Kich Thuoc La :" + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Error ! Loi Truyen Tham So Am ");
            throw new IllegalAccessException("Capacity :" + capacity);
        }
    }

    public void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khoi Tao Thanh Cong, Kich Thuoc Sau Khi Tang Them " + minCapacity + " La :" + newSize);
        } else {
            throw new IllegalAccessException("MinCapacity :" + minCapacity);
        }
    }

    public boolean add(E e) throws IllegalAccessException {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public Object[] remove(int index) throws IllegalAccessException {
        if (index < 0 || index > elements.length) {
            throw new IllegalAccessException("Error index :" + index);
        }
        elements = (Object[]) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[size - 1] = null;
        size--;
        return elements;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> arrayList = new MyArrayList<>();
        arrayList.elements = Arrays.copyOf(elements, size);
        arrayList.size = size;
        return arrayList;
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }
    public void clear(){
        size = 0;
        for (int i = 0; i <elements.length ; i++) {
            elements[i] = null;
        }
    }
}
