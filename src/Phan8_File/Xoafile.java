package Phan8_File;

import java.io.File;
public class Xoafile {
    public static void main(String[] args)
    {
        try{

            File file = new File("D://newfile.txt");

            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete failed: File didn't delete");
            }
        }catch(Exception e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
