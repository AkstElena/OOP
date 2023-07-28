public class Student extends User implements Comparable<Student>, Printable<Student> {

    private String firstName;
    private String lastName;
    private int id;
    private int meanBall;

    public Student(String firstName, String lastName, int id, int meanBall) {
        super(firstName, lastName, id);
        this.meanBall = meanBall;
    }

    public double getMeanBall() {
        return meanBall;
    }

    public void setMeanBall(int meanBall) {
        this.meanBall = meanBall;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", meanBall=" + meanBall +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.getMeanBall() - o.getMeanBall());
    }

    @Override
    public void print() {
        System.out.println(super.toString() + " mean ball= " + meanBall);
    }
}
