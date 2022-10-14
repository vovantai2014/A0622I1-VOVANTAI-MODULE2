package ss14_sort_algorithm.bai_tap;

public class InsertionSortAlgorithm {
    static int [] list = {5, -2, 8, 9, 6, -10, 0 };

    public static void insertionSort(int [] array){
        for(int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        insertionSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");

        }
    }
}
