import java.util.Calendar;
import java.util.Scanner;

public class Person {
    /* Class Person should consists of
    two private fields: name and birthYear (the birthday year)
    properties for access to these fields
    default constructor and constructor with 2 parameters */
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    private Person (){}

    private Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
        /* methods:
    age - to calculate the age of person
    input - to input information about person
    output - to output information about person
    changeName - to change the name of person  */
    public int age(){
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(Calendar.YEAR);
        return year- birthYear;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = sc.next();
        System.out.println("Enter birthday year:");
        this.birthYear = Integer.parseInt(sc.next());
    }
    public String output() {
        return ("The name is: "+name+", birthday year: "+birthYear);
    }
    public void changeName (String name) {
        this.name = name;
    }
    /* In the method main() create 5 objects of Person type and input information about them. */

    public static void main (String... args){
        Person person1 = new Person("Ann", 1988);
        Person person2 = new Person("Jon", 1977);
        Person person3 = new Person("Philip", 1990);
        Person person4 = new Person("Tina", 1986);
        Person person5 = new Person("Ivan", 1960);
    }
}
