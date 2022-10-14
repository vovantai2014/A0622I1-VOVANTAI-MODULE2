package ss14_sort_algorithm.thuc_hanh;

public class BubbleSort {
    static int [] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int [] array){
        boolean isPassed = true;
        for (int i = 0; i < array.length - 1; i++) {
            isPassed = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isPassed = false;
                }
            }
            if (isPassed) break;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        bubbleSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
