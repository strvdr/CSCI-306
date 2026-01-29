package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import utilities.MyConverter;

public class TestConversions {
	public static final double EPSILON = .0001;

	@Test
	public void testEnglishToMeters()
	{
		double expected = 0.0508;
		double actual = MyConverter.englishToMeters(0, 2);	
		assertEquals(expected, actual, EPSILON);
		expected = 0.3556;
		actual = MyConverter.englishToMeters(1, 2);	
		assertEquals(expected, actual, EPSILON);
	}

}
