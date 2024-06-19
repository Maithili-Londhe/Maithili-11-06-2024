package com.fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) throws IOException
	{
		
		FileOutputStream out = null;
		BufferedOutputStream bout = null;

		String name2 = "Hello Guys, Welcome to Java World";
		
		byte values[] = name2.getBytes();

		
		try
		{

			File file = new File("C:\\\\Java Development\\\\test\\\\second.txt");

			if(file.exists()) 
			{
				System.out.println("file is not available");		
			}
			else
			{
				out = new FileOutputStream(file);
				bout = new BufferedOutputStream(out);
				
				bout.write(values);	
				
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
			bout.close();
			out.close();
		}
		
	}

}
