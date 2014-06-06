package th.golf.kata.RomanNumerals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertRomanNumeralsTest{
	
	@Test
	public void testConvert1ReturnI(){
		ConvertRomanNumerals romanNumerals = new ConvertRomanNumerals();
		String romanNum = romanNumerals.convertRoman(1);
		assertEquals("I",romanNum);
	}
}