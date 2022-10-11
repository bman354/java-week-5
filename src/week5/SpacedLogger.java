package week5;



public class SpacedLogger implements Logger {

	@Override
	public void Log(String string) {
		
		System.out.println("");
		//iterate through the string and print the character at the iterator, with a space after
		for(int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i) + " ");
		}
		
	}

	@Override
	public void Error(String string) {
		
		System.out.print("\nERROR: ");
		//iterate through the string and print the character at the iterator, with a space after
			for(int i = 0; i < string.length(); i++) {
				System.out.print(string.charAt(i) + " ");
			}
		
	}

	

}
