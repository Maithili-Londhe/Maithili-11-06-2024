package com.fileHandling;

import java.io.File;
import java.io.IOException;
//To check wheather file is exist on the location(provided) or not.
public class Example1 {

	public static void main(String[] args) throws IOException
	{


		String name = "Hello";

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

			File file = new File("C:\\Java Development\\test\\first.txt");

			if(file.exists()) 
			{
				System.out.println("file is available");;
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
	}

}
