package exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo2
{
	int div(int no1,int no2)  throws InvalidValue
	{
		int ans=0;
		if (no2 <= 0) 
		{
			throw new InvalidValue("\"plz enter positive value of no2\\\"");
			
		}else 
		{
			ans = no1/no2;
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ExceptionDemo2 obj = new ExceptionDemo2();
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans=0;
		try {
			ans = obj.div(no1, no2);
		} catch (InvalidValue e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Division : " + ans);
	}
}