package SuperKeyword;

public class Activity {
	void drink() {
		System.out.println("drinking");
	}
}
	class Dog extends Activity{
		void drink() {
			System.out.println("drinking milk");
		}
		void bark() {
			System.out.println("barking");
		}
		void work() {
			super.drink();
			bark();
		}
	}
	class TestSuper3{
		public static void main(String args[]) {
			Dog d = new Dog();
			d.work();
		}
	}

