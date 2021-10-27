package ThreadsSync;

public class Table {
	void printTable(int multiplier) {
		System.out.println(Thread.currentThread().getName()+"--thread is in printTable method");
		synchronized(this) {
			for(int i=1;i<6;i++) {
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i*multiplier);
			}
		}
	}

}
