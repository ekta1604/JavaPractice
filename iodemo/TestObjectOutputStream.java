package iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

    public static void main(String args[])
    {
        Student obj = new Student(1,"Ekta",89);
        try(
            FileOutputStream fout =new FileOutputStream("sturcd.txt");
            ObjectOutputStream out =new ObjectOutputStream(fout);
        )
        {
            out.writeObject(obj);
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("Successfully write object file");
        }
    }
    
}
