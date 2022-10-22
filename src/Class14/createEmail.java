package Class14;

public class createEmail {
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    public static void main(String[] args) {
        createEmail(" Tymur", "Safin ", " yahoo");

    }
    static void createEmail(String name, String lastName, String emailProvider){
        name = name.toLowerCase().trim();
        lastName = lastName.toLowerCase().trim();
        emailProvider = emailProvider.toLowerCase().trim();
        System.out.println(name + lastName + "@" + emailProvider + ".com");
    }
}
