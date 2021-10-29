package dependency.injection;

public class FrameworkFactory {
	public static void main(String[] args) {
		Service Serviceb = new
				ServiceB();
		Client client = new ClientA(Serviceb);
		client.dosomething();
	}

}
