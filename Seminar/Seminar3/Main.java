/* - Создать класс Студент
- Создать класс УчебнаяГруппаИтератор
- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
- Реализовать его контракты (включая удаление)
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", "Ivanov", 1, 5);
        Student student2 = new Student("Boris", "Ivanov", 2, 4);
        Student student3 = new Student("Anna", "Borisova", 3, 3);

        ArrayList<Student> groupStudents = new ArrayList<>();
        groupStudents.add(student1);
        groupStudents.add(student2);
        groupStudents.add(student3);

        // StudentGroup group1 = new StudentGroup(groupStudents);

        // System.out.print(group1.toString());
        // System.out.println("---------------");
        // for (Student student : groupStudents) {
        // System.err.println(student);
        // }
        // System.out.println("---------------");

        // StudentGroupIterator studentGroupIterator = new StudentGroupIterator(group1);

        // while (studentGroupIterator.hasNext()) {
        // Student temp = studentGroupIterator.next();
        // if (temp.getMeanBall() < 4) {
        // studentGroupIterator.remove();
        // }
        // }

        System.out.print(groupStudents.toString());

        Collections.sort(groupStudents);
        // System.out.print(group1.toString());

        System.out.println("---------------");

        // groupStudents.sort(new StudentNameComporator());
        System.out.print(groupStudents.toString());

        // System.out.println("---------------");

        // groupStudents.sort(new StudentNameComporator().reversed());
        // System.out.print(group1.toString());
    }

}
