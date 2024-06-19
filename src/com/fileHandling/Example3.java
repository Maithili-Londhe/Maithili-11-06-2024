package com.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) throws IOException
	{
		
		FileOutputStream out=null;

		String name1 = "Hello";
		String name2 = ", World";
		
		byte values[] = name2.getBytes();

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

			if(file.exists()) 
			{
				 out = new FileOutputStream(file, true);
				out.write(values);	
				System.out.println("Content added succefully");
			}
			else
			{
				System.out.println("file is not available");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			out.close();
		}
		
	}

}
