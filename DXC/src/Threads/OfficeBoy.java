package Threads;

public class OfficeBoy extends Thread{
	public OfficeBoy(String name) {
		super(name);
	}
	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(3000);
			System.out.println("getting water");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
