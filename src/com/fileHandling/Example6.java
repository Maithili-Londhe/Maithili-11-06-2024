package com.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//filestream is converts string into bytes and bufferedstream only speed up that process.
public class Example6 {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		FileInputStream input = null;
		BufferedInputStream bin=null;
		
		try
		{
			 input= new FileInputStream("C:\\\\Java Development\\\\test\\\\first.txt");
			 out = new FileOutputStream("C:\\\\Java Development\\\\test\\\\second2.txt");
		       bout = new BufferedOutputStream(out);
		       bin=new BufferedInputStream(input);
		        //reading
				int index = 0;
	            while ((index = bin.read()) != -1) {
	            	//writing
	            	bout.write(index);
	                System.out.print((char)index);
	            }   
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				input.close();
				bout.close();
				out.close();
				bin.close();
			}
			
		
	}

}
