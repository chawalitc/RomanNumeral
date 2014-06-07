package th.golf.kata.RomanNumerals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertRomanNumeralsTest{
	
	ConvertRomanNumerals romanNumerals = new ConvertRomanNumerals();

	@Test
	public void testConvert1ReturnI(){	
		String romanNum = romanNumerals.convertRoman(1);
		assertEquals("I",romanNum);
	}

	@Test
	public void testConvert2ReturnII(){
		String romanNum = romanNumerals.convertRoman(2);
		assertEquals("II",romanNum);
	}

	@Test
	public void testConvert3ReturnIII(){
		String romanNum = romanNumerals.convertRoman(3);
		assertEquals("III",romanNum);
	}

	@Test
	public void testConvert4ReturnIV(){
		String romanNum = romanNumerals.convertRoman(4);
		assertEquals("IV",romanNum);
	}

	@Test
	public void testConvert5ReturnV(){
		String romanNum = romanNumerals.convertRoman(5);
		assertEquals("V",romanNum);
	}

	@Test
	public void testConvert6ReturnVI(){
		String romanNum = romanNumerals.convertRoman(6);
		assertEquals("VI",romanNum);
	}

}