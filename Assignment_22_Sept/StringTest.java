package Assignment_22_Sept;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest 

{

	@Test
	public void test() 
	{
		Main main = new Main();
		
		String str = "Java is Object Oriented and Java is a good programmig Language Too";
		int expected = 2;
		
		int actual = main.findDuplicateInString(str);
		assertEquals(expected,actual);
	}
	
	
	

}
