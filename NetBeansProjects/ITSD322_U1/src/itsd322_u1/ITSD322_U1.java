package itsd322_u1;
import java.util.Scanner; 
/**
 *
 * @author Michelle
 */
public class ITSD322_U1 {

    
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner (System.in);
        
        //Declare local variables
        String empName;
        String empAddress;
        String empPosition;
        
        System.out.println("Welcome");
        System.out.println("------------------");
        
        //Ask user to enter employer name, employer address, and position
        System.out.println("Please enter your employer's name");
        empName = userInputScanner.nextLine();
        
        System.out.println("Please enter your employer's address");
        empAddress = userInputScanner.nextLine();
        
        System.out.println("Please enter your position");
        empPosition = userInputScanner.nextLine();
        
        //Process and output results
        
        System.out.println("Your employer's name is: " + empName);
        System.out.println("Your employer's address is: " + empAddress);
        System.out.println("Your Position is: " + empPosition);
        
        System.out.println("--------END OF PROGRAM-----------");
    }
    
}
