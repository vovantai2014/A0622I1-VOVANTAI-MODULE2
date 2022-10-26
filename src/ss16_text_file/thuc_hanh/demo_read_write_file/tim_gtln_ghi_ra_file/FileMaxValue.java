package ss16_read_write_file.thuc_hanh.demo_read_write_file.tim_gtln_ghi_ra_file;

import java.util.List;

public class FileMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if (max <numbers.get(i)){
                max = numbers.get(i);
            }

        }
        return max;

    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(("a.txt"));
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt",maxValue);
    }
}
