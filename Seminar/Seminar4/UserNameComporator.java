import java.util.Comparator;

public class UserNameComporator<T extends User> implements Comparator<T> {

  // @Override
  // public int compare(Student o1, Student o2) {
  // return o1.getFirstName().compareTo(o2.getFirstName());
  // }

  // public int compare(T o1, T o2) {
  // int resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
  // if (resultOfComparing == 0) {
  // resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
  // }
  // return resultOfComparing;
  // }

  @Override
  public Comparator<T> reversed() {
    return Comparator.super.reversed();
  }

  @Override
  public int compare(T o1, T o2) {
    return o1.getFirstName().compareTo(o2.getFirstName());
  }

}
