package latihan1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Kalkulator class to perform basic arithmetic operations.
 */
public class Kalkulator {
    
    private int bilangan1;
    private int bilangan2;

    /**
     * Gets the first number.
     * 
     * @return the first integer (bilangan1).
     */
    public int getBilangan1() {
        return bilangan1;
    }

    /**
     * Sets the first number.
     * 
     * @param bilangan1 the first integer to be set.
     */
    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    /**
     * Gets the second number.
     * 
     * @return the second integer (bilangan2).
     */
    public int getBilangan2() {
        return bilangan2;
    }

    /**
     * Sets the second number.
     * 
     * @param bilangan2 the second integer to be set.
     */
    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }

    /**
     * Adds two numbers based on user input.
     * 
     * @throws IkiException if the input is not an integer.
     */
    public void tambahBilangan() throws IkiException {
        Scanner inputBilangan = new Scanner(System.in);
        try {
            System.out.print("Bilangan 1: ");
            this.setBilangan1(inputBilangan.nextInt());
            System.out.print("Bilangan 2: ");
            this.setBilangan2(inputBilangan.nextInt());
        } catch (InputMismatchException e) {
            throw new IkiException("Bilangan harus bertipe data Integer");
        }
    }

    /**
     * Displays the result of division.
     */
    public void tampilhasilPembagian() {
        try {
            double hasilBagi = this.hasilBagi();
            System.out.println("Hasil Pembagian: " + hasilBagi);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Exception - " + e);
        }
    }

    /**
     * Performs division between the first and second numbers.
     * 
     * @return the result of the division as a double.
     * @throws ArithmeticException if there is a division by zero.
     */
    public double hasilBagi() {
        return (double) this.bilangan1 / this.bilangan2;
    }
}