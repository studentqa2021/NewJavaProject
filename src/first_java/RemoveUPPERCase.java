package first_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveUPPERCase {
	//remove the upper case from string
	
	public static String changeCase(String name) {
		
		String regEx="[A-Z]";
		
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(name);
		String toLOwere = m.replaceAll("");
		//System.out.println(toLOwere);
		return toLOwere;
	
	}
	
}
