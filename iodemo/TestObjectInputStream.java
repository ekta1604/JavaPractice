package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream 
{
	public static void main(String[] args) 
	{
		try (
				FileInputStream  fin = new FileInputStream("E:\\Java\\iodemo\\sturcd.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);                                                         	
			)	
		{
			Student sobj = (Student)oin.readObject();
			System.out.println(sobj.getRno() + " " + sobj.getName() + " " + sobj.getStd());
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
