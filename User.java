public class User {
    
    // Attributes:
    int id;
    String firstname;
    String lastname;
    String email;   
    String password;
    int age;
    String profissional;

    // Constructor:
    public User(int id, String firstname, String lastname, String email, String password, int age, String profissional) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.profissional = profissional;
    }
    // Methods:
    public static void displayUser(String firstname, String lastname, String email, int age, String profissional){
        System.out.println("User: " + firstname + " " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profissional);
    }
}
