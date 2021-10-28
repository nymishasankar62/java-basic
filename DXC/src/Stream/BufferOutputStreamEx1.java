package Stream;
import java.io.*;
public class BufferOutputStreamEx1 {
public static void main(String args[]) throws Exception {
	FileOutputStream fout = new FileOutputStream("C:\\Users\\hp\\Desktop\\test.txt");
	BufferedOutputStream bout = new BufferedOutputStream(fout);
	String s = "Welcome to JavaTpoint";
	byte b[] = s.getBytes();
	bout.write(b);
	bout.flush();
	bout.close();
	fout.close();
	System.out.println("Success");
	}

	

}
