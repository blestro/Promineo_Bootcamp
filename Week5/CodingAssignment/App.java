package week5.CodingAssignment;

public class App {
	
	
	public static void main(String[] args){
		Logger aLog = new AsteriskLogger();
		Logger sLog = new SpacedLogger();
		
		aLog.log("Anything I guess");
		aLog.error("Anything I guesso");
		
		sLog.log("Hello");
		sLog.error("Hello");
	}
}
