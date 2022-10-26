package ss16_read_write_file.bai_tap.read_file_csv;

import ss16_read_write_file.thuc_hanh.demo_read_write_file.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    public static void writeFile(List<Country> countries, String fileName){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true))){

            for (Country country: countries) {
                bufferedWriter.write(country.getInfo());
                bufferedWriter.newLine();
            }
            //bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Country> readFile(String fileName){
        List<Country> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line = null;
            while ((line = bufferedReader.readLine()) !=null){
                if (line.trim().equals("")){
                    continue;
                }
                list.add(new Country(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
