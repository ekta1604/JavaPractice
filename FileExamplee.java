import java.io.File;
import java.util.Scanner;
// import java.util.scanner;
import java.io.IOException;
public class FileExamplee {

        public static void main(String[] args)throws IOException
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the desired name of your file: ");
            String fileName = input.nextLine();
            fileName = fileName + ".txt";
            File objDir=new File("e:\\filename");
            File objFile=new File("e:\\filename");
            if(!objFile.exists())
            {
                objFile.createNewFile();
            }
            else
            {
                System.out.println("the file already exists..");
            }
            if(!objDir.exists())
            {
                objDir.mkdir();
            }
            else{
                System.out.println("The floder already exists");
            }
        }
    
}
