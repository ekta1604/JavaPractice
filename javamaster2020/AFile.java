package javamaster2020;

public class AFile {

	public static void main(String[] args) {
		A a = new A();
		a.start();

	}
}

class A extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}