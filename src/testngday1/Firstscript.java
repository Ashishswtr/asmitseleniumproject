package testngday1;

import org.testng.annotations.Test;

public class Firstscript {
	
	@Test(priority = 1)
	void open_webpage()
	{
		System.out.println("hello Ashish");
	}
	@Test(priority = 2)
	void open_url()
	{
		System.out.println("open_url");
	}
	@Test(priority = 3)
	void close_webpage()
	{
		System.out.println(" close_webpage");
	}

}
