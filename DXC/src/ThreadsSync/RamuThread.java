package ThreadsSync;

public class RamuThread extends Thread {
	Table mTable;
	public RamuThread(Table table) {
		mTable = table;
	}
	@Override
	public void run() {
		super.run();
		mTable.printTable(5);
	}

}
