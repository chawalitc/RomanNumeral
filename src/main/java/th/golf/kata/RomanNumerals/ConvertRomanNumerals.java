package th.golf.kata.RomanNumerals;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ConvertRomanNumerals{
	
	public String convertRoman(int number){

		String romanNum ="";
		List<Integer> romans = new ArrayList<Integer>();
		romans.add(9);
		romans.add(5);
		romans.add(4);

		Map<Integer,String> mapRoman = new HashMap<Integer,String>();
		mapRoman.put(9,"IX");
		mapRoman.put(5,"V");
		mapRoman.put(4,"IV");

		for  (Integer num : romans) {	
			if(number >= num){
				romanNum += mapRoman.get(num);
				number = number-num;
			}
		}

		for(int i=0;i<number;i++){
			romanNum += "I";			
		}
		return romanNum;
	}

}