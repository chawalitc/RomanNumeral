package th.golf.kata.RomanNumerals;

public class ConvertRomanNumerals{
	
	public String convertRoman(int number){

		String romanNum ="";

		if(number == 9 ){
			romanNum = "IX";
			number = number-9;
		}
		if(number >= 5){
			romanNum += "V";
			number = number-5;
		}
		if(number == 4 ){
			romanNum = "IV";
			number = number-4;
		}
		for(int i=0;i<number;i++){
			romanNum += "I";			
		}
		return romanNum;
	}

}