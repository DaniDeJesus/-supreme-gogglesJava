import java.util.Scanner;

public class TextProcessingTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String strInput;
		strInput = input.next();
		StringStats(strInput);

	}
	public static void StringStats(String str) {
		
		
		
		int symbol = 0, letter = 0, num = 0;
		
		for (int i = 0; i < str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num++;
				
			}
			if(Character.isLetter(str.charAt(i))) {
				letter++;
			}
		
	}
	//	System.out.print(symbol);
		System.out.print("There are: " + letter + " Letters");
		System.out.print("There are: " + num + " Numbers");
		
//Not sure about this, unable to branch off, had to add new branch:
		if(subString.regionMatches(0, SubString, 0, theString.length())
			 System.out.println(SubString+" found "+(times+".");//have to add counter
			 else
			 System.out.println(SubString+" not found")
	 
 	char[] charSubString= CheckSubstringV3.toCharArray();
 	for (int i=0;i<charSubString.length;i++) {
 	charSubString[i]=Character.toUpperCase(charSubString[i]);
		//ends here
 }

}
	
}
