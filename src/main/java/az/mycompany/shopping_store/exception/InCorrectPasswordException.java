package az.mycompany.shopping_store.exception;

public class InCorrectPasswordException extends RuntimeException{

    public InCorrectPasswordException(String message) {
        super(message);
    }
}
