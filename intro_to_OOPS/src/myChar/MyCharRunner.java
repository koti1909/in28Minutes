package myChar;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar mychar = new MyChar('9');
		
		System.out.println(mychar.isVowel());
		
		System.out.println(mychar.isAlphabet());
		
		System.out.println(mychar.isNumber());
		
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
		
	}

}
