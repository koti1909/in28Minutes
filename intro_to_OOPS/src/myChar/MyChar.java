package myChar;

public class MyChar {
	private char character;

	public MyChar(char character) {
		// TODO Auto-generated constructor stub
		this.character = character;
	}
	
	boolean isVowel() {
		if(character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U') {
			return true;
		}
		return false;
	}
	
	boolean isAlphabet(){
		if((character >= 65 && character<=90) || (character >= 97 && character<=122))
			return true;
		return false;
	}
	
	boolean isNumber(){
		if(character >= 48 && character <=57)
			return true;
		return false;
	}
	
	public static void printLowerCaseAlphabets(){
		for(int i=97;i<=122;i++) {
			char c = (char)i;
			System.out.println(c);
		}
	}
	
	public static void printUpperCaseAlphabets(){
		for(int i=65;i<=90;i++) {
			char c = (char)i;
			System.out.println(c);
		}
	}

}
