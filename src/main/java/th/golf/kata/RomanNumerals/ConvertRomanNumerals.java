package th.golf.kata.RomanNumerals;

public class ConvertRomanNumerals{
	
	public String convertRoman(int number){

		String romanNum ="";
		for(int i=0;i<number;i++){
			romanNum += "I";
		}
		return romanNum;
	}

}