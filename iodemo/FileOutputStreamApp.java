package iodemo;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class FileOutputStreamApp {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        byte b[]=name.getBytes();

        FileOutputStream fout =null;

        try{
            fout=new FileOutputStream("test.txt");
            fout.write(b);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
                fout.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }
            System.out.println("data write in text file");
        }
    }
    
}
