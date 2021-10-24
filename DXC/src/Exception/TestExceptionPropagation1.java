package Exception;

import java.io.IOException;

public class TestExceptionPropagation1 {
	public void m() throws IOException{
		throw new IOException();
	}
	public void n() throws IOException
	{
		m();
	}
	public void p() {
		try {
			n();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TestExceptionPropagation1 tp1 = new TestExceptionPropagation1();
		tp1.p();
	}

}
