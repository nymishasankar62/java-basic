package Exception;

public class MulticatchBlock {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOfBoundException e");
			}
		catch(ArithmeticException e) {
			System.out.println("Arithemrtic Exception occurs");
			
		}
		catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
		
	}

}
