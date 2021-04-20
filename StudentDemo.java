import java.util.ArrayList;
import java.util.Scanner;

import iodemo.Student;

public class StudentDemo {

     public static void main(String[] args) {
        
        ArrayList<Student>list=new ArrayList<Student>();
        int choice=0;
        while(choice!=6)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("1. For Insert");
            System.out.println("2. For Upadate");
            System.out.println("3. For Delete");
            System.out.println("4. For Display");
            System.out.println("5. For Searching by name");
            System.out.println("6. Exit");

            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                Student s=new Student();
                s.scan();
                list.add(s);
                System.out.println("Student record successfully inserted");
                break;

                case 2:
                System.out.println("Enter roll number which you want to update");
                int updateRno=sc.nextInt();
                int i=0;
                for(;i<list.size();i++)
                {
                    if(list.get(i).getRno()==updateRno)
                    {
                        break;
                    }
                }
                Student updateObj=list.get(i);
                updateObj.update();

                list.set(i,updateObj);
                System.out.println("Successfully updated");
                break;

                case 3:
                break;

                case 4:
                int i;
                for(i=0;i<list.size();i++)
                {
                    Student sdisp=list.get(i);
                    System.out.println(sdisp.getRno()+" "+sdisp.getName()+" "+sdisp.getStd());
                }
                break;

                case 5:
                System.out.println("Enter name you want to search");
                sc.nextLine();
                String searchname=sc.nextLine();
                boolean flag = false;
                int j=0;
                for(;j<list.size();j++)
                {
                    if(searchname.equalsIgnoreCase(list.get(j).getName()))
                    {
                        flag=true;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println("search name successfully found..");
                    s=list.get(j);
                    System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd());
                    
                }else{
                    System.out.println("Student name record not found in list object");
                }
                break;

                case 6;
                System.out.println("System will bet excited whithin 5 sec");
                System.exit(0);
                break;
                
                default:
                break;

            }
        }

    }
    
}
