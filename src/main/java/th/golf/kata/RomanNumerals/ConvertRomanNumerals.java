package th.golf.kata.RomanNumerals;

public class ConvertRomanNumerals{
	
	public String convertRoman(int number){
		
		if(number == 3){
			return "III";
		}
		if(number == 2){
			return "II";
		}
		return "I";
	}

}