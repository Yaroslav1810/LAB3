package exceptions;

public class TowelWet extends Exception {
	public TowelWet(String message) {
		super(message);
	}
	
	@Override 
	public String getMessage() {
		return "Ошибка: " + super.getMessage();
		
	}
}
