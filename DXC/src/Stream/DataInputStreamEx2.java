package Stream;
import java.io.*;
public class DataInputStreamEx2 {
	public static void main(String[] args) throws IOException {  
	    InputStream input = new FileInputStream("C:\\Users\\hp\\Desktop\\test.txt");  
	    DataInputStream data = new DataInputStream(input);  
	    int count = input.available();  
	    byte[] b = new byte[count];  
	    data.read(b);  
	    for (byte bt : b) {  
	      char a = (char) bt;  
	      System.out.print(a+"-");  
	    }  
	  }  

}
