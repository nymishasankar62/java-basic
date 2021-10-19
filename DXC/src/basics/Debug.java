package basics;

public class Debug {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.add(10, 20);
		System.out.println("The sum is " +sum);
		throw new NullPointerException();
	}

}
