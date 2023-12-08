package Phan8_File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ghifile {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file;
        String mycontent = "public class HelloWorld\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        System.out.println(\"Hello, World!\");\n" +
                "    }\n" +
                "}";
        try {

            file = new File("D://newfile.txt");
            fos = new FileOutputStream(file);


            if (!file.exists()) {
                file.createNewFile();
            }


            byte[] bytesArray = mycontent.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            try {
                if (fos != null)
                {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }
    }
}
