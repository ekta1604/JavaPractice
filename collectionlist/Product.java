// package collectionlist;
import java.util.Scanner;
public class Product {
    private int id;
    private String name;
    private int price;
    Scanner sc=new Scanner(System.in);

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }
    public void scan() 
	{
		System.out.print("Enter id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter price : ");
		price = sc.nextInt();
	}
	public void update() 
	{
        sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter price : ");
		price = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(id + " " + name + " " + price);
	}
}