import java.util.ArrayList;

public class StudentGroup {

    private ArrayList<Student> students;

    public StudentGroup(ArrayList<Student> student) {
        this.students = student;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}
