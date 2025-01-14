package exceptions;

public class CharacterNonExistent extends RuntimeException {
    public CharacterNonExistent(String message) {
        super(message);
    }
    
    @Override
    public String getMessage() {
        return "Ошибка: " + super.getMessage();
    }
}
