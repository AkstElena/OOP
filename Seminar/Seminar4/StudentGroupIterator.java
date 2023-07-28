import java.util.ArrayList;
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

  private final ArrayList<Student> students;
  private int count;

  public StudentGroupIterator(StudentGroup students) {
    this.students = students.getStudents();
    this.count = 0;
  }

  @Override
  public boolean hasNext() {
    if (count < students.size()) {
      return true;
    }
    return false;

  }

  @Override
  public Student next() {
    if (hasNext()) {
      count++;
      return students.get(count);
    }
    return null;

  }

  @Override
  public void remove() {
    students.remove(count);

  }

}
