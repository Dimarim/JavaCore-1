import javax.naming.Name;

public class Employee {
    /* Class Employee should consists of
	    three private fields: name, rate and hours;
	    static field totalHours
	    properties for access to these fields;
	    default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters; */
    private String name;
    private int rate;
    private int hours;
    static int totalHours;
    static int percentBonus = 30;

    public void setName(String name) {
        this.name = name;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public static void setTotalHours(int totalHours) {
        Employee.totalHours = totalHours;
    }
    public static void setPercentBonus(int percentBonus) {
        Employee.percentBonus = percentBonus;
    }
    public String getName() {
        return name;
    }
    public int getRate() {
        return rate;
    }
    public int getHours() {
        return hours;
    }
    public static int getTotalHours() {
        return totalHours;
    }

    public static int getPercentBonus() {
        return percentBonus;
    }

    private Employee(){}

    private Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    private Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    /* 	methods:
        salary - to calculate the salary of person (rate * hours)
        toString - to output information about employee
        changeRate - to change the rate of employee
        bonuses – to calculate % from salary  */

    public int selary() {
    return this.rate * this.hours;
    }
    public String toString() {
        return ("Name: " +name+", rate: "+rate+", hours: "+ hours );
    }
    public void changeRate(int rate){
        this.rate = rate;
    }
    public int bonuses() {
        return this.percentBonus * this.rate * this.hours / 100;
    }
    /* In the method main() create 3 objects of Employee type. Input information about them.
        Display the total hours of all workers to screen  */
    public static void main (String...args){
        Employee employee1 = new Employee("Artur", 100, 20);
        Employee employee2 = new Employee("Kate", 60, 25);
        Employee employee3 = new Employee("Mishel", 110, 33);
        totalHours = employee1.hours + employee2.hours + employee3.hours;
        System.out.println(totalHours);
    }
}
