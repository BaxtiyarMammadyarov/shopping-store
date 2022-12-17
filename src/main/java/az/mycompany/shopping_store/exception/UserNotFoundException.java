package az.mycompany.shopping_store.exception;

public class UserNotFoundException extends  RuntimeException{

    public UserNotFoundException(String message) {
        super(message);
    }
}
