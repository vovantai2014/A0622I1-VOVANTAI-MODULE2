package ss16_read_write_file.thuc_hanh.demo_read_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeFile(List<Student> students, String fileName){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (Student student: students) {
                bufferedWriter.write(student.getInfo());
                bufferedWriter.newLine();

            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void writeFileOptimize(List<Student> students, String fileName){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true))){
            for (Student student :students) {
                bufferedWriter.write(student.getInfo());
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readFile(String fileName){
        List<Student> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line = null;
            while ((line = bufferedReader.readLine()) !=null){
                if (line.trim().equals("")){
                    continue;
                }
                list.add(new Student(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
