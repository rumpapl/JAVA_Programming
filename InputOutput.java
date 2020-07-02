import java.util.Scanner; // Import the Scanner class

/**
 * Hello
 */
public class InputOutput {

    public static void main(String[] args) {

        Scanner myScanner= new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter userName");
        String userName = myScanner.nextLine(); // Read user input

        System.out.println("Enter userAge");
        int age = myScanner.nextInt();

        System.out.println("Enter userWeight");
        float weight = myScanner.nextFloat();

        System.out.println("Enter userHeight");
        double height = myScanner.nextDouble();

        System.out.println("User name is: " + userName + "\nUser age is: " + age + "\nUser weight is: " + weight + "\nUser height is " + height); // Output user input
      
    }
}