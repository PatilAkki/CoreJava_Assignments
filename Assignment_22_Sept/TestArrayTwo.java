package Assignment_22_Sept;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayTwo {

	@Test
	public void test() 
	{
		
		ArrayClassTwo arrayClass = new ArrayClassTwo();
	   int[] array = {5,4,2,3,1,6};
	   int expected = 4;
	   
	   int actual = arrayClass.ForthLargest(array);
	   assertEquals(expected, actual);
	}

}
