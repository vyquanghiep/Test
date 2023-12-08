package Phan8_File;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class DocFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\newfile.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while (dis.available() != 0) {
                System.out.println(dis.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            bis.close();
            dis.close();
        }
    }
}
