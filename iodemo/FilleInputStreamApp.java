package iodemo;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilleInputStreamApp {
    public static void main(String args[])
    {
        try{
            FileInputStream fin=new FileInputStream("test.txt");

            int temp;

            while((temp=fin.read())!=-1)
            {
                System.out.println((char)temp);
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            
            e.printStackTrace();
        }
    }

    
}
