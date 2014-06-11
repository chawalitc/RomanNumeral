package th.golf.kata.RomanNumerals;

public class ConvertRomanNumerals{
	
	public String convertRoman(int number){

		String romanNum ="";

		romanNum += getRomanNumber(number,9,"IX");
		number = minusRoman(number,9);

		romanNum += getRomanNumber(number,5,"V");
		number = minusRoman(number,5);

		romanNum += getRomanNumber(number,4,"IV");
		number = minusRoman(number,4);

		for(int i=0;i<number;i++){
			romanNum += "I";			
		}
		return romanNum;
	}

	private int minusRoman (int number,int compareNum) {
		if(number >= compareNum){
			number = number-compareNum;
		}
		return number;
	}

	private String getRomanNumber (int number,int compareNum ,String romanNum) {
		if(number >= compareNum){
			return romanNum;
		}
		return "";
	}
}