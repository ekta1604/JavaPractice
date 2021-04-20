// // import java.util.Scanner;
// public class StringCount {

//     public static void main(String args[])
//     {
//         // Scanner sc=new Scanner(System.in);
//         // System.out.println("Enter String");
//         // String s="java is developed by james";
//         char ch[]= new char[string.length()]; 
//         System.out.println(s);
//         int count=0;
//         for(int i=0;i<String.length();i++)
//         {
//             // if(s.charAt(i) != ' ') 
//             ch[i]= String.charAt(i); 
//             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
//             count++;
//         }
//         System.out.println(count); 
//     }    
// }
public class StringCount {  
    static int wordcount(String string)  
      {  
        int count=0;  
    
          char ch[]= new char[string.length()];     
          for(int i=0;i<string.length();i++)  
          {  
              ch[i]= string.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
      }  
    public static void main(String[] args) {  
        String string ="java is developed by james   ";  
       System.out.println(wordcount(string) + " words.");   
  }  
}
