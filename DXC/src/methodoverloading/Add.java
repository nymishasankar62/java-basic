package methodoverloading;

public class Add {
	static int add(int a,int b){
		return a+b;
		}  
	static int add(int a,int b,int c){
		return a+b+c;
		}  
	}  
	class TestOverloading1{  
	public static void main(String[] args){  
	System.out.println(Add.add(25,66));  
	System.out.println(Add.add(76,11,199)); 
	}
	}