package cognizant;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException , IOException {
	
		String path="C:\\Users\\admin\\Desktop\\Java1\\Java\\data.txt";
		String newpath="C:\\Users\\admin\\Desktop\\Java1\\Java\\copy.txt";
		File file = new File(path);
		FileInputStream in = new FileInputStream(file);
		BufferedInputStream bin= new BufferedInputStream(in);
		FileOutputStream out = new FileOutputStream(newpath);
		BufferedOutputStream bout= new BufferedOutputStream(out);
		int i;
		while((i=bin.read()) != -1)
		{
			//System.out.print((char)i);
			bout.write(i);
			
		}
		bout.close();
		System.out.println("File Name : " +file.getName());
		System.out.println("File length : " +file.length());
		System.out.println(" Parent Name : " +file.getParent());
		System.out.println("File Path : " +file.getPath());
		//System.out.println("File Path : " +available());

		
	}


}

