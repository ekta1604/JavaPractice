// package collectionlist;

import java.util.Scanner;
import java.util.LinkedList;

public class ProductDemo {
    public static void main(String[] args) {
        LinkedList<Product> list = new LinkedList<Product>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 6) {
            System.out.println("1) For Insert           ");
            System.out.println("2) FOR Update           ");
            System.out.println("3) FOR Delete           ");
            System.out.println("4) Display All records  ");
            System.out.println("5) Searching by Name	");
            System.out.println("6) Exit	");

            choice = sc.nextInt();

            switch (choice) {
            case 1:
                Product s = new Product();
                s.scan();
                list.add(s);
                System.out.println("Product record successfully inserted");
                break;
            case 2:
                System.out.println("Enter id which you want to update - ");
                int updateid = sc.nextInt();
                int i = 0;
                for (; i < list.size(); i++) {
                    if (list.get(i).getid() == updateid) {
                        break;
                    }
                }
                // Student updateObj = list.get(i);
                s = list.get(i);
                // updateObj.update();
                s.update();
                // list.set(i, updateObj);
                list.set(i, s);
                System.out.println("Product record successfully updated");
                break;
            case 3:
                System.out.println("Enter which number you want to delete: ");
                int delid = sc.nextInt();
                // i =0;
                for (i = 0; i < list.size(); i++) {
                    if (list.get(i).getid() == delid) {
                        break;
                    }
                }
                list.remove(i);
                System.out.println("Product record deleted...");
                System.out.println();
                break;

            case 4:
                System.out.println();
                for (i = 0; i < list.size(); i++) {
                    // Student sdisp = list.get(i);
                    s = list.get(i);
                    System.out.println(
                            "Id no: " + s.getid() + " "+"Name: " + s.getname() + " "+"Std: " + s.getprice());
                }
                System.out.println();
                break;
            case 5:
                System.out.print("Enter the price of the product you want to search for: ");
                sc.nextLine();
                int sprice = sc.nextInt();
                boolean flag = false;
                i = 0;
                for (; i < list.size(); i++) {
                    if (sprice==(list.get(i).getprice())) {
                        // System.out.println(num1.compareTo(num2)); 
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("The name you searched for is found successfully...");
                    s = list.get(i);
                    System.out.println("Id no: " + s.getid() + " Name: " + s.getname() + " Price: " + s.getprice());
                } else {
                    System.out.println("Product record not found...");
                }
                break;
            case 6:
                System.out.println("Thank you for visiting.... visit again");
                System.exit(0);
                break;

            default:
                System.out.println("Please enter a valid number...");
                break;
            }
        }
        sc.close();
    }
}