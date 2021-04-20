// import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        String str="i am eeeeeekta";
        char ch='e';
        int fre=0;

        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                fre++;
            }
        }
        System.out.println("fre of "+ch+" is: "+fre);
    }
}
// public class p6 {

//     public static void main(String[] args) {
//         String str = "This website is awesome.";
//         char ch = 'e';
//         int frequency = 0;

//         for(int i = 0; i < str.length(); i++) {
//             if(ch == str.charAt(i)) {
//                 ++frequency;
//             }
//         }

//         System.out.println("Frequency of " + ch + " = " + frequency);
//     }
// }
