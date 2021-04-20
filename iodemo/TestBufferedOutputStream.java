package iodemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestBufferedOutputStream {

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();

        byte b[]=name.getBytes();

        try{
            
            FileOutputStream fout = new FileOutputStream("testbuffer.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            bout.write(b);
            bout.flush();
            fout.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
            System.out.println("Task Done");
        }
    }
    
}
