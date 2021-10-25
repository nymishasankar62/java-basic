package Threads;

public class WorkThread implements Runnable {
	String message;
	public WorkThread(String msg) {
		message = msg;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":--i am working on -- "+message);
		processMessage();
		System.out.println("i am done with "+message+" thread name is "+Thread.currentThread().getName());
	}
	private void processMessage() {
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
