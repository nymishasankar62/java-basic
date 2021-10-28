package Generics;

public class GenericDemo {
	public static void main(String[] args) {
		Account<String> account = new Account<String>();
		account.setObj("HDFC Account");
		System.out.println(account.getObj());
		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setObj(987654321);
		System.out.println("gpay account no is " + gpayAccount.getObj());
		Account <Float> phonePeAccount = new Account<>();
		phonePeAccount.setObj(3.14f);
		System.out.println("phonepay account no is"+ phonePeAccount.getObj());
	}

}
