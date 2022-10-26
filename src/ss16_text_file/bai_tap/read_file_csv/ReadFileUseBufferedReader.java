package ss16_read_write_file.bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFileUseBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
//            br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\listcountries.txt"));
              br = new BufferedReader(new FileReader("contries.csv"));


            while ((line = br.readLine()) != null) {
                 getInfo(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private static void getInfo(List<String> country) {
        System.out.println(
                "Country [number= "
                        + country.get(0)
                        + ", id= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}

