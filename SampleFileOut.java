import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampleFileOut
{
    public static void main(String[] args)throws IOException{
        File obj=new File("d:\\t1.txt");
        FileOutputStream fos=new FileOutputStream(obj);
        byte cities[]={'e','k','t','a'};
        fos.write(cities);
        fos.close();
        FileInputStream fis=new FileInputStream(obj);
        int ch;
        while((ch=fis.read())!=-1)
        {
            System.out.println((char)ch);
        }
        fis.close();
    }
    ]
}