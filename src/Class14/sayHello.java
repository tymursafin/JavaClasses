package Class14;

public class sayHello {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed
    public static void main(String[] args) {
        sayHelloIn("France");

    }
    static void sayHelloIn(String country){
        switch (country) {
            case "Spain":
                System.out.println("Hola");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Germany":
                System.out.println("Guten tag");
                break;
            default:
                System.out.println("");
                break;
        }
    }
}
