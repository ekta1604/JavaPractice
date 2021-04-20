package javamaster2020;

public class SyncDemo {

	public static void main(String[] args) throws Exception {

		Sum s = new Sum();
		s.start();
		synchronized (s) {
			s.wait();
		}
		System.out.println("total = " + s.sum);
	}
}

//wait -- notify --> sync. 
class Sum extends Thread {
	int sum = 0;

	public void run() {
		increment();
	}

	 void increment() {
		for (int i = 1; i <= 10000; i++) {
			sum = sum + 1;// 10000
		}
		synchronized (this) {
			notify();
		}
	}
}
