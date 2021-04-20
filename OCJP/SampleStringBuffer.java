//import java.util.Scanner;
// public class SampleStringBuffer
// {
//     public static void main(String args[])throws IOException
//     {
//        // Scanner sc =new Scanner(System.in)
//        FileInputStream f1=null;
//        FileInputStream f2=null;
//        FileWriter frw=new FileWriter("e\\f1.txt");
//        SequenceInputStream file3=null;
//        f1=new FileInputStream("e\\f2.txt");
//        f2=new FileInputStream("e\\f3.txt");
//        file3=new SequenceInputStream(f1,f2);
//        BufferedInputStream bis=new BufferedInputStream(file3);
//        int ch;
//        while((ch=bis.read())!=-1)
//        {
//            System.out.print((char)ch);
//            frw.write(ch);
//        }
//        bis.close();
//        f1.close();
//        f2.close();
//        frw.close();

    
//     }
// }
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SampleStringBuffer{

	public static void main(String args[])throws IOException{
	FileInputStream f1=null;
	FileInputStream f2=null;
	FileWriter frw=new FileWriter("f:\\file1.txt");
	SequenceInputStream file3=null;
	f1=new FileInputStream("f://filetest.txt");
f2=new FileInputStream("f://filetest1.txt");

file3=new SequenceInputStream(f1, f2);
BufferedInputStream bis=new BufferedInputStream(file3);
int ch;
	while((ch=bis.read())!=-1){
		System.out.print((char)ch);
		frw.write(ch);
	}
	bis.close();
	f1.close();
	f2.close();

}
}