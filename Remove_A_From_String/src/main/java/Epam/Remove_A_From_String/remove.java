package Epam.Remove_A_From_String;

public class remove {
	public String removeA(String string) {
		String res = string;
		if(string.length() >= 1 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')) {
			res = string.substring(1);
		}
		if(string.length() >= 2 && (string.charAt(0) != 'A'|| string.charAt(0) != 'a') && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			res = string.charAt(0) + string.substring(2);
		}
		if(string.length() >= 2 && (string.charAt(0) == 'A' || string.charAt(0) == 'a')  && (string.charAt(1) == 'A' || string.charAt(1) == 'a' )) {
			res = string.substring(2);
		}
		return res; 
	}
}
