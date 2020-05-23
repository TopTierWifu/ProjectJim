package me.josh444.projectjim.utils;

public class Word {

	public static String toTitleCase(String string) {
		
		if(string.isEmpty()) {return string;}
		
		if(string.length() == 1) {return string.toUpperCase();}
		
		string = string.toLowerCase();
		
		String[] words = string.split("_");
	
		for(int i=0; i < words.length; i++) {
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
		}
		
		String result = "";
		
		for(int i=0; i < words.length; i++) {
			if(i != words.length-1) {
				result += words[i].concat(" ");
			} else {
				result += words[i];
			}
		}
		
		return result;
	}
}
