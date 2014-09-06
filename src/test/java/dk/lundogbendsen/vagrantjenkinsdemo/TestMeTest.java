package dk.lundogbendsen.vagrantjenkinsdemo;

import junit.framework.Assert;

import org.junit.Test;


public class TestMeTest {

	@Test
	public void shouldAddIntegers() {
		Integer result = new TestMe().add(1,2);
		
		Assert.assertEquals(new Integer(3), result);
	}

}
