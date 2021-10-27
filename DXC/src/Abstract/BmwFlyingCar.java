package Abstract;
public  class BmwFlyingCar extends Flyingcar {
	@Override
	public void stopcar() {
	
	}
	@Override
	public void flycar() {
			}
	@Override
	public void landcar() {
	}
	public static	int add(int a, int b) {
		return a+b;
	}

	public static boolean isEligibletoVote(int age) {
		if (age >17) {return true;}
		return false;
	}
}
