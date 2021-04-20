package javamaster2020;

public class BankSyncDemo {

	public static void main(String[] args) {

//		ICICI cust1 = new ICICI();// balance = 15000
//		ICICI cust2 = new ICICI();// balance = 15000
//
//		cust1.start();
//		cust2.start();

		ICICI royal = new ICICI();// balance=15000
//
		Thread manojSir = new Thread(royal);
		manojSir.setName("ManojSir");
		Thread hirenSir = new Thread(royal, "HirenSir");
//
		manojSir.start();
		hirenSir.start();

		try {
			Thread.sleep(3000);
			System.out.println("final =>" + royal.balance);
//			System.out.println(cust1.balance);
//			System.out.println(cust2.balance);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class ICICI extends Thread {
	// n- instance n-copy
	int balance = 15000;
	String name;
	int count = 0;
	static int demo = 0;// ICICI cust1 , cust2
	// 1 and only 1

	synchronized static void updateDemo() {
		demo++;

		synchronized (ICICI.class) {
			System.out.println("class level lock....");
		}
	}

	public void run() {
		wid(10000);
	}

	// thread-safe
	// locking -- object level [ all instance variables are gonna locked -- or
	// allocate to thread who got the lock ]
	// locking -- class level--STATIC --thread --sync method --> any object --> any
	// thread --> can not access a single method
	void wid(int amt) { // 6 minutes
		// 5000 -- 1 minutes
		// print?no -- 1 minutes

		synchronized (this) {

			if (balance - amt >= 5000) { // 1 minutes
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance = balance - amt;// 1 minutes

				System.out.println("wid done...for " + currentThread().getName());// 1 minutes
				// updated balance
				System.out.println("balance = " + balance);// 1 minutes

			} else {
				System.out.println("insufficient balance.....for...." + currentThread().getName());
			}
		}
	}

	//

}