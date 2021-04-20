import java.io.File;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) throws IOException{
        File objDir = new File("e:\\FileExample");
        File objFile1 = new File("e:\\FileExample\\Second\\Second.txt");
        File objDir2 = new File("e:\\File_Example\\Second");
        File objFile = new File("e:\\FileExample\\First.txt");
        
        if (!objFile.exists()) {
            objFile.createNewFile();
        }else{
            System.out.println("The file1 already Exists");
        }
        if (!objFile1.exists()) {
            objFile1.createNewFile();
        }else{
            System.out.println("The file2 already Exists");
        }
        if (!objDir.exists()) {
            objDir.mkdir();
        } else {
            System.out.println("The folder1 already exists");
        }
        if (!objDir2.exists()) {
            objDir2.mkdir();
        } else {
            System.out.println("The folder2 already exists");
        }
    }
}
