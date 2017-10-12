
public class Student {
    /* Class Student should consists of
    two private fields: name and rating;
    properties for access to these fields
    static field avgRating – average rating of all students
    default constructor and constructor with parameters
    */
    private String name;
    private int rating;
    static int avgRating=0;
    static int counter;
    static int totalRating;

    public void setName(String name) {
        this.name = name;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    public static void setCounter(int counter) {
        Student.counter = counter;
    }
    public static void setAvgRating(int avgRating) {
        Student.avgRating = avgRating;
    }

    private Student() {}

    private Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        counter++;
        totalRating = totalRating + rating;
    }

    /* methods:
    betterStudent - to definite the better student (between two, return true or false)
    toString - to output information about student
    changeRating - to change the rating of student
    */
    public boolean betterStudent(int rating) {
        if (rating > avgRating)
            return true;
        else
            return false;
    }

    public String toString() {
        return "Student [Name = " +name+ ", rating = " +rating+ "]";
    }

    public void changeRating(int rating) {
        totalRating = totalRating - this.rating + rating;
        this.rating = rating;
    }

    /* In the method main() create 3 objects of Student type and input information about them.
    Display the average and total rating of all student. */

    public static void main (String...args) {
        Student student1 = new Student("Василь", 20 );
        Student student2 = new Student("Олександр", 18);
        Student student3 = new Student("Петро", 21);

        avgRating = totalRating/counter;
        System.out.println("Total rating: "+totalRating+", average rating: "+avgRating);

    }

}
