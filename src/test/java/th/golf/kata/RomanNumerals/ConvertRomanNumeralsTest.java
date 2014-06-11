package th.golf.kata.RomanNumerals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertRomanNumeralsTest{
	
	ConvertRomanNumerals romanNumerals = new ConvertRomanNumerals();

	@Test
	public void testConvert1ReturnI(){	
		assertEquals("I",romanNumerals.convertRoman(1));
	}

	@Test
	public void testConvert2ReturnII(){
		assertEquals("II",romanNumerals.convertRoman(2));
	}

	@Test
	public void testConvert3ReturnIII(){
		assertEquals("III",romanNumerals.convertRoman(3));
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
	public void testConvert6ReturnVI(){
		assertEquals("VI",romanNumerals.convertRoman(6));
	}

	@Test
	public void testConvert7ReturnVII(){
		assertEquals("VII",romanNumerals.convertRoman(7));
	}
}