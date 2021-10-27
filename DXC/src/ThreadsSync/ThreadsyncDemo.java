package ThreadsSync;



public class ThreadsyncDemo {
	public static void main(String[] args) {
		Table table = new Table();
		ShamuThread shamuThread = new ShamuThread(table);
		RamuThread ramuThread = new RamuThread(table);
		shamuThread.start();
		ramuThread.start();
	}
}