package Stream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExample {
public static void main(String[] args) {
		
        try {
			FileOutputStream foutPipe = new FileOutputStream("C:\\Users\\hp\\Desktop\\test.txt");
            foutPipe.write(69);    
            foutPipe.close();   
            System.out.println("success...");    

 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    

	}

}
