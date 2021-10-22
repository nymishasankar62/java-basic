package Abstract;

public class Wiring {
	public static void main(String[] args) {
		ISwitchBoardListener sListener = new SolarAppliances();
		sListener.switchOne();
		sListener.switchTwo();
		sListener.switchThree(12);
		sListener.switchFour();
	}
}
