import java.util.Scanner;

public class Login{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine();
        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        if(userEmail.equals(email) && userPassword.equals(password)){
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid email or password.");
        }
    }
}