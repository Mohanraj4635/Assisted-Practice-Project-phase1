package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex{
	
	public static void main(String[] args) {
		
		String regex="[a-z]+";
		String input="tat";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if (match.matches()) {
			System.out.println("Matching");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}