package th.golf.kata.RomanNumerals;

public class ConvertRomanNumerals{
	
	public String convertRoman(int number){

		String romanNum ="";
		if (number ==5){
			return "V";
		}
		else if (number ==4){
			return "IV";
		}
		else{
			for(int i=0;i<number;i++){
				romanNum += "I";
			}
		}
		return romanNum;
	}

}