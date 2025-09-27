import java.util.Scanner;
import java.util.Random;    


public class Register {

    public static int idGenerator(){ //Gerador de ID aleatório de 6 dígitos
        Random random = new Random();
        int id = random.nextInt(900000) + 100000;
        return id;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your profession: ");
        String profissional = scanner.nextLine();

        int id = idGenerator();

        User newUser = new User(id, firstname, lastname, email, password, age, profissional);

        scanner.close();
    }
}
