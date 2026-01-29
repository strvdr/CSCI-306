package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import windchill.MyTempConverter;

public class TestWindchillCalcs {

	@Test
	public void testWindchill() throws Exception {
		int expected = -11;
		int actual = MyTempConverter.calcWindChill(5, 0);
		assertEquals(expected, actual);
		assertEquals(3, MyTempConverter.calcWindChill(10, 15));		
	}
	
	@Test
	public void testNoWind() throws Exception   {
		assertEquals(20, MyTempConverter.calcWindChill(2, 20));				
	}	
	
	@Test (expected = Exception.class)
	public void testNegativeWindSpeed() throws Exception {
		MyTempConverter.calcWindChill(-1, 20);
	}	

}
