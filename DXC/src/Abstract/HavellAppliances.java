package Abstract;

public class HavellAppliances implements ISwitchBoardListener {
	@Override
	public void switchOne() {
		System.out.println("havells fan is on");
		}
	@Override
	public int switchTwo() {
		System.out.println("havells ac is on");
		return 20;
	}
	@Override
	public boolean switchThree(int type) {
		System.out.println("havells led is on");
		return false;
	}
	@Override
	public void switchFour() {
		System.out.println("havells tublight is on");
	}

}
