package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        var path = "Data/config.properties"; // location of the file
        var fileInputStream = new FileInputStream(path); // navigate and open file
        var properties = new Properties(); //
        properties.load(fileInputStream); // loads all the data from the file inside (Memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("browser"));
        fileInputStream.close(); // closes the file
    }
}
