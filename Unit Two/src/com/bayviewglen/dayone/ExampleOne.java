package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		// String class
		// String example "Hello"
		// String: is a sequence of characters
		//Same as integers declare them
		
		//Methods of Strings
		
		//upper case = does stuff
		String word = "Alphabet";
		//create alphabet, and reference it
		String word2 = word;
		//reference to "ALphabet"
		String word3 = "Alphabet";

		word2 = "bye";
		//Create bye, and then reference it
		// each reference has individual primitive characters, classified by char
		// each char has a paticular index that allow you to access them.
		
		// important method: length
		
		word.length();
		// return type = int length()
		//last index = length-1
		
		//important method: equals
		// = assign
		//== equals
		//word == word2 true
		word.equals(word2); //true
		//word == word3 false (not same address even if same value
		word.equals(word3); //true, checks the sequence of characters
		word.equalsIgnoreCase(word2); // ignores the letter case of the string
		//equals returns a boolean = true or false
		
		// important method: charAt
		
		word.charAt(6); //='e'
		
		word.charAt(word.length()-1);//last character
		
		word.charAt(word.length()/2);// middle character
		
		//word.charAt returns a char charAt(int);
		
		//important methods: indexOf
		
		word.indexOf('b'); // = 5
		
		word.indexOf("pha"); // = 2
		
		word.indexOf("Pha"); // returns -1 if not true
		
		//single quote =char, double quote = string;
		// int indexOf(char)
		//int indexOf(String)
		// if multiple occurences returns first place
		
		//important methods: substring
		
		word.substring(1,4); // would return start inclusive to end exclusive = lph
		
		word.substring(2,word.length()); // first term to last term exclusive = phabet
		
		word.substring(2); // any term beyond the first declared = phabet
		// returns string (substring(int,int), or substring(int)
		
		//use nextLine
		
			
		
		

	}

}
