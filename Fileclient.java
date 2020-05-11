import java.io.*;
import java.net.*;
import java.util.*;

public class Fileclient{
	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Reading file from Server\n 2. Transfering File");
		int n = sc.nextInt();
		switch(n){
		case 1:{
			byte b[]=new byte[20002];
			Socket sr=new Socket("localhost", 6777); 
			InputStream is=sr.getInputStream();
	 		int i=0;    
            		while((i=is.read())!=-1){    
				System.out.print((char)i);    
            		}    
			is.read (b, 0, b.length);
		       }	
		case 2:{
			Socket sr=new Socket("localhost", 6777); 
			byte b[]=new byte[20002];			
			InputStream is=sr.getInputStream(); 
			System.out.println("Enter the name of the file to Write :");
        		Scanner scanner = new Scanner(System.in);
        		String file_name = scanner.nextLine();
    			FileOutputStream fr = new FileOutputStream(file_name);
			is.read (b, 0, b.length);	
			fr.write(b, 0, b.length);
		       }
		}
	}
}
