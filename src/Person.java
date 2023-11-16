import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Person {
    String firstname;
    String surname;
    String Street;
    String zipcode;
    String city;
    public void initialize() throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your firstname");
        firstname = Br.readLine();
        System.out.println("Enter your surname");
        surname = Br.readLine();
        System.out.println("Enter your street");
        Street = Br.readLine();
        System.out.println("Enter your zipcode");
        zipcode = Br.readLine();
        System.out.println("Enter your city");
        city = Br.readLine();
    }
    public void Print(){
        System.out.println("Entering date about a person");
        System.out.println("Firstname :" + firstname);
        System.out.println("surname:"+ surname);
        System.out.println("street:"+ Street);
        System.out.println("zipcode:"+ zipcode);
        System.out.println("city:"+ city);
    }

}
