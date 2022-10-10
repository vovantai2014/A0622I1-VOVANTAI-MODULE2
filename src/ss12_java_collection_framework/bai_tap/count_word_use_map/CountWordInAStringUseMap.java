package ss12_java_collection_framework.bai_tap.count_word_use_map;

import java.util.*;

public class CountWordInAStringUseMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần kiểm tra : ");
        String str = sc.nextLine();
        str = str.replaceAll(",", "");
        String[] array = str.split(" ");
        String key = "";
        Integer value;

        Map<String, Integer> stringIntegerMap = new TreeMap<String, Integer>();
        for (int i = 0; i < array.length; i++) {
            key = array[i];
            if (stringIntegerMap.containsKey(key)) {
                value = stringIntegerMap.get(key);
                stringIntegerMap.remove(key);
                stringIntegerMap.put(key, value + 1);
            } else {
                stringIntegerMap.put(key, 1);
            }
        }

        Set set = stringIntegerMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            key = (String) iterator.next();
            System.out.println("Từ " + key + " xuất hiện : " + stringIntegerMap.get(key) + " lần.");
        }
    }
}
