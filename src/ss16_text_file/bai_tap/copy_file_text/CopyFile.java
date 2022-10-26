package ss16_read_write_file.bai_tap.copy_file_text;

import java.io.*;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile {
    public static void main(String[] args)  {
        InputStream inputStream;
        OutputStream outputStream;

        try {
            inputStream = new FileInputStream(new File("C:\\Users\\User\\Desktop\\source.txt"));

            outputStream = new FileOutputStream(new File("C:\\Users\\User\\Desktop\\target.txt"));

            int fileSize;
            byte[] bytes = new byte[1000];

            if ((fileSize = inputStream.read(bytes)) < 0) {
                throw new FileNotFoundException("File nguồn không có nội dung");
            } else {
                outputStream.write(bytes, 0, fileSize);
                System.out.println("File da copy thanh cong");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}