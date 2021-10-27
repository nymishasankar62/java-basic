package Polymorphism;

public class Bike9 {
	final int speedlimit=90;//final variable  
	
	 void run(){  
		//speedlimit=400;  
	}  
	
	
	public static void main(String args[]){  
		Bike9 obj=new  Bike9();  
		obj.run();  
		Bike9 myBike = new Bike9(); 
		Honda myHonda = new Honda(); 
		//myHonda = (Honda) myBike; 
		myBike = (Bike9)myHonda; 
	}  
}
class Honda extends Bike9{
	int petrolTank = 5;
	void run() {System.out.println("running safely with 100kmph");}
}
