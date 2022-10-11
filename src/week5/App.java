package week5;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger newAsteriskLog = new AsteriskLogger();
		SpacedLogger newSpacedLogger = new SpacedLogger();
		newAsteriskLog.Log("hello there");
		newAsteriskLog.Error("oops");
		
		newSpacedLogger.Log("testing is fun");
		newSpacedLogger.Error("Funny Error");
		
	}

}
