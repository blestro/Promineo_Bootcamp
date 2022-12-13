package week5.CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		String newLog = log.replace("", " ");
		System.out.println(newLog.trim());
		
	}

	@Override
	public void error(String error) {
		String newError = error.replace("", " ");
		System.out.println("ERROR: " + newError.trim());
		
	}

}
