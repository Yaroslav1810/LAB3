package exceptions;

public class AlreadyDryException extends Exception {
    public AlreadyDryException(String message) {
        super(message); 
    }
    
    @Override
    public String getMessage() {
        return "Ошибка: " + super.getMessage();
    }
}