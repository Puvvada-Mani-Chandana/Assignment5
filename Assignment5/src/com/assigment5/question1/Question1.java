package com.assigment5.question1;
class Multithreaded implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<=100) {
			System.out.println("Thread name: " + Thread.currentThread().getName() + " " + i);
			i++;

		}
	}
	
}
public class Question1 {
	public static void main(String args[]) {
		Multithreaded multi=new Multithreaded();
		Thread thread1=new Thread(multi,"Thread1");
		Thread thread2=new Thread(multi,"Thread2");
		Thread thread3=new Thread(multi,"Thread3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
