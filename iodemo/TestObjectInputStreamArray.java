package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStreamArray {
	public static void main(String[] args) {
		try (FileInputStream fin = new FileInputStream("E:\\Java\\iodemo\\sturcd.txt");
		    ObjectInputStream oin = new ObjectInputStream(fin);) 
        {
			Student sobj[] = (Student[]) oin.readObject();

			for (int i = 0; i < sobj.length; i++) 
			{
				System.out.println(sobj[i].getRno() + " " + sobj[i].getName() + " " + sobj[i].getStd());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}