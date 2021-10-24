package Exception;

public class TestExceptionPropagation {
	void m() {
		System.out.println("im in M");
		int data=50/0;
		System.out.println("im in M after exception");
	}
	void n() {
		System.out.println("im in N");
		m();
		System.out.println("im in N after exception");
	}
	void p() {
		System.out.println("im in p");
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		System.out.println("im in P after exception");
	}
		public static void main(String[] args) {
			System.out.println("im in MAIN");
			TestExceptionPropagation obj = new TestExceptionPropagation();
			obj.p();
			System.out.println("im in MAIN after exception");
			System.out.println("normal flow");
		}
}