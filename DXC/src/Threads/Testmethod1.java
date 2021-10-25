package Threads;

public class Testmethod1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i+"--"+Thread.currentThread().getName());
		}
	}
	public static void main(String args[]) {
		Testmethod1 t1 = new Testmethod1();
		t1.setName("first thread");
		Testmethod1 t2 = new Testmethod1();
		t2.setName("second thread");
		Testmethod1 t3 = new Testmethod1();
		t3.setName("third thread");
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
		}

}
