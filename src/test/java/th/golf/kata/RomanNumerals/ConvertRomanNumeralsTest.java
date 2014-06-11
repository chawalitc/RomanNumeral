package th.golf.kata.RomanNumerals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertRomanNumeralsTest{
	
	ConvertRomanNumerals romanNumerals = new ConvertRomanNumerals();

	@Test
	public void testConvertLessThan4ReturnI(){
		assertEquals("II",romanNumerals.convertRoman(2));
	}

	@Test
	public void testConvert4ReturnIV(){
		assertEquals("IV",romanNumerals.convertRoman(4));
	}

	@Test
	public void testConvert5ReturnV(){
		assertEquals("V",romanNumerals.convertRoman(5));
	}

	@Test
	public void testConvertMoreThan5ReturnVI(){
		assertEquals("VI",romanNumerals.convertRoman(6));
	}

}