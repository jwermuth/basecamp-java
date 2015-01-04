package dk.lundogbendsen.vagrantjenkinsdemo;

import junit.framework.Assert;

import org.junit.Test;


public class TestMeTest {

	@Test
	public void shouldAddIntegers() {
		Integer result = new TestMe().add(1,2);
		
		Assert.assertEquals(new Integer(3), result);
	}

	@Test
	public void shouldSubtractIntegers() {
		Integer result = new TestMe().subtract(2,1);
		
		Assert.assertEquals(new Integer(1), result);
	}
}
