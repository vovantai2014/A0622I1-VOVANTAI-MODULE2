package ss16_read_write_file.thuc_hanh.demo_read_write_file.tim_gtln_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filepath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filepath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }

        catch (Exception e) {
            System.err.println("File khong ton tai or noi dung trong file co loi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Gia tri lon nhat la :" +max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
