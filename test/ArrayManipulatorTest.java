import junit.framework.Assert;

import org.junit.Test;


public class ArrayManipulatorTest {
	
	ArrayManipulator arrayManipulatorobj = new ArrayManipulator();
	
	@Test
	public void shouldReturn5GivenArrayof5Only(){
	
		Assert.assertEquals(5, arrayManipulatorobj.largestOfArray(new int[]{5}));
	
	}
	
	@Test
	public void shouldReturn2GivenArrayOf1and2(){
		
		Assert.assertEquals(2, arrayManipulatorobj.largestOfArray(new int[]{1,2}));
		
	}
	
	

}
