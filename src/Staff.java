import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Staff extends Person{
    String Education;
    String Position;
    public void Initialize1()throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education:");
        Education = Br.readLine();
        System.out.println("Enter your position");
        Position = Br.readLine();
    }
    public void Print1(){
        Print();
        System.out.println( "Education:"+ Education);
        System.out.println("position:" + Position);
    }
}
class HR {
    public static void main(String[] args) throws IOException {
        Staff employee = new Staff();
        employee.Initialize1();
        employee.Print1();
        employee.initialize();
        employee.Print();
        Person person = new Person();
        person.initialize();
        person.Print();
    }
}

