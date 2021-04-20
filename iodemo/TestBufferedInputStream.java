package iodemo;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestBufferedInputStream  {

    public static void main(String args[])
    {
        try{
            FileInputStream fin = new FileInputStream("testbuffer.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int temp=0;
            while((temp=bin.read())!=-1)
            {
                System.out.print((char)temp);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }finally{
            System.out.println("Task Done");
        }

    }
    
}
