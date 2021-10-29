package dependency.injection;

public class ClientA implements Client {
	Service service;
	public ClientA(Service serv) {
		service = serv;
	}
	@Override
	public void dosomething() {
		String info = service.getInfo();
		System.out.println(info);
	}

}
