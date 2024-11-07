package latihan1;
import java.util.InputMismatchException;

/**
 * Main class to run the application, handling input and displaying the results of calculations.
 */
public class Main {

    /**
     * The main method that initiates the calculator application.
     * 
     * @param args command-line arguments (not used).
     * @throws IkiException if there is an exception related to the IkiException class.
     */
    public static void main(String[] args) throws IkiException {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Menghitung pembagian 2 bilangan");
        System.out.println("====================================");
        
        try {
            kalkulator.tambahBilangan();
        } catch (IkiException e) {
            System.out.println("Terjadi Exception - " + e);
        }
        
        kalkulator.tampilhasilPembagian();
        System.out.println("PROGRAM BERJALAN NORMAL");
    }
}
