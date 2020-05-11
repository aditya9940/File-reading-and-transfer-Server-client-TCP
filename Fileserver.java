import java.io.*;
import java.net.*;
import java.util.*;
public class Fileserver{
	public static void main (String[] args) throws Exception {
		
			System.out.println("Server ready for connection");
			ServerSocket s=new ServerSocket(6777);
			Socket sr=s.accept();
			System.out.println("Connection is successful and wating for chatting");
			System.out.println("Enter the name of the file :");
        		Scanner scanner = new Scanner(System.in);
        		String file_name = scanner.nextLine();
			FileInputStream fr = new FileInputStream(file_name);
			byte b[] = new byte[2002];
			fr.read(b, 0, b.length);
			OutputStream os = sr.getOutputStream();
			os.write(b, 0, b.length);
		
	}
}
