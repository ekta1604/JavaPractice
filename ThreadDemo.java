package javamaster2020;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("free processors =>" + Runtime.getRuntime().availableProcessors());
		//
		Copy c = new Copy();
		Print p = new Print();
		// c.start();
		// p.start();
		// 1 thread main => c.start p.start
		// c ->thread --> stack --> 10 copy
		// p ->thread --> stack --> 10 print
		// 20 minutes

		// c.run();
		// p.run();
		// 1 thread ->stack -> 10 copy 10 print
		// 20minutes

		ExecutorService ex = Executors.newCachedThreadPool();// 3
		ex.submit(c);
		ex.submit(p);
		// queue c , p
		// jvm --> worker --> os
		// w1 w2 w3 w4 w5[60second]  
		// c p   x  y  
		// 10 minutes

		ex.shutdown();// release -> os
	}
}
//1  extends Thread or [ ]
//2  override run - logic 
//3  start  

class Copy extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("copy : " + i);
		}
	}

}

class Print extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("print : " + i);
		}
	}
}
