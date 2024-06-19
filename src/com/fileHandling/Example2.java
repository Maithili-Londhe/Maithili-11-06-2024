package com.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//Writing the content into existing file.
public class Example2 {

	public static void main(String[] args) throws IOException
	{
		
		FileOutputStream out = null;

		String name = "Hello";
		String name2 = ", World";
		
		byte values[] = name.getBytes();

		/**
		 * byte
		 * 	- 
		 * 
		 * char
		 *  -
		 * buffer
		 *  -
		 * object
		 *  -
		 */

		try
		{

			File file = new File("C:\\\\Java Development\\\\test\\\\first.txt");
//			if(file.createNewFile())
//			{
//				System.out.println("File Created");
//			}
//			else
//			{
//				System.out.println("File already exists");
//			}
			if(file.exists()) 
			{
				  out = new FileOutputStream(file, true);
	                out.write(values);
	            } else {
	                System.out.println("File is not available");
	            }

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 finally {
	                 out.close();
	       	     }
		
	}

}
