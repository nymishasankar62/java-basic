package methodoverriding;

public class vehicle {
	void run(){
		System.out.println("Vehicle is running");
		}
}
class Bike2 extends vehicle{
	void run(){
		System.out.println("vehicle is not running");
	}
	public static void main(String args[]){
		Bike obj =  ew Bike();  
		obj.run();
	}
}