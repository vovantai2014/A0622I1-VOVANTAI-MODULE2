package ss13_search_algorithm.thuc_hanh;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int value) {
        int mid;
        int left = 0, right = list.length - 1;
        while (left < right) {
            mid = (left + right) / 2;
            if (list[mid] == value) {
                return mid;
            } else if (list[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,50));
        System.out.println(binarySearch(list,27));
    }
}
