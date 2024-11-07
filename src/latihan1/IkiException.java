package latihan1;


/**
 * Custom exception class IkiException for handling specific exceptions in the calculator.
 */
public class IkiException extends Exception {
    
    /**
     * Constructs a new IkiException with a specified message.
     * 
     * @param message the detail message to be displayed.
     */
    public IkiException(String message) {
        super(message);
    }
}