package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String string) {
		
		System.out.println("***" + string + "***");
		
	}

	@Override
	public void Error(String string) {
		
		int asteriskCount = 0;
		StringBuilder asterisks = new StringBuilder();
		//figure out how many asterisks to print per line, depending on the length of the string passed into it plus the extra length of "Error: "
		while(asteriskCount <= (string.length() + 12)) {
			asteriskCount++;
			asterisks.append("*");
		}
		
		//print the first line of asterisks as long as the entire line
		System.out.println(asterisks);
		
		//print the second line of error
		System.out.println("***" + "Error: " + string + "***");
		
		//print the third line, the same length of asterisks as the first
		System.out.println(asterisks);
	}
}
