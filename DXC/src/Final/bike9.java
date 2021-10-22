package Final;

public class bike9 {
	final int speedlimit=80;
	void run() {
		System.out.println("bike9 speed limit id "+speedlimit);
	}
	public static void main(String args[]) {
		bike9 obj=new bike9();
		obj.run();
		bike9 myBike = new bike9();
		Honda myHonda = new Honda();
		myBike = (bike9)myHonda;
	}
}
	class Honda extends bike9{
		int petroltank = 5;
		void run() {
			System.out.println("running safely with 100kmph");
		}
	}