
package productentry;

/**
 * @author Brian Logan
 */
import java.util.Scanner; // program uses class Scanner
        
public class ProductEntry {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in); // declare Scanner
      
      int ProductID; // declare product ID variable as an integer
      String ProductName; // declare product name variable as a string
      double ProductPrice; // declare product price variable as a decimal number
      
      System.out.println("Please provide a product ID."); // prompt
      ProductID = input.nextInt(); // assign input to var
      
      System.out.println("Please provide a product name."); // prompt
      ProductName = input.next(); // assign input to var
      
      System.out.println("Please provide the product price."); // prompt
      ProductPrice = input.nextDouble(); // assign input to var
      
      // system confirms data collection to user
      System.out.println(); // visual spacer
      System.out.printf("%s%n%s%n", "You have successfully entered a new product.", "Here's the info:"); // formatted line to display sentences individually
      System.out.println(); // visual spacer
      
      // system displays results of user entry with a formatted line
      System.out.printf("Product ID: %d%nProduct Name: %s%nProduct Price: %f%n", ProductID, ProductName, ProductPrice);
   }
   
}
