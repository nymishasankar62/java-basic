package Stream;
import java.io.*;
public class BufferInputStream {
	public static void main(String args[]){
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\hp\\Desktop\\test.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1) {
				System.out.println((char)i);
			}
			bin.close();
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}