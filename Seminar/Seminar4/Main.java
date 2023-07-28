/* - Создать класс Студент
- Создать класс УчебнаяГруппаИтератор
- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
- Реализовать его контракты (включая удаление)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
         * Box box = new Box(Arrays.asList(new Apple(1), new Orange(0.5)));
         * System.out.println(box);
         * 
         * GenericBox<Fruit> genBox = new GenericBox<>(Arrays.asList(new Apple(1), new
         * Orange(0.5)));
         * System.out.println(genBox);
         * 
         * GenericBox<Apple> genBoxA = new GenericBox<>(Arrays.asList(new Apple(1), new
         * Apple(0.5)));
         * System.out.println(genBoxA);
         * GenericBox<Orange> genBoxO = new GenericBox<>(Arrays.asList(new Orange(1),
         * new Orange(2.5)));
         * System.out.println(genBoxO);
         * System.out.println(genBoxA.compareTo(genBoxO));
         */

        Student student1 = new Student("Ivan", "Ivanov", 1, 5);
        Student student2 = new Student("Boris", "Ivanov", 2, 4);
        Student student3 = new Student("Kira", "Petrova", 3, 3);

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

        // System.out.print(group1.toString());

        // Collections.sort(groupStudents);
        // System.out.print(group1.toString());

        // System.out.println("---------------");

        // groupStudents.sort(new StudentNameComporator());
        // System.out.print(group1.toString());

        // System.out.println("---------------");

        // groupStudents.sort(new StudentNameComporator().reversed());
        // System.out.print(group1.toString());

        UserNameComporator<User> compStud = new UserNameComporator<>();

        groupStudents.sort(compStud);

        Teacher teacher1 = new Teacher("Ivan", "Ivanov", 5, 4.3, "economic");
        Teacher teacher2 = new Teacher("Petr", "Ivanov", 10, 3.8, "math");

        List<User> userList = new ArrayList<>();
        userList.add(student1);
        userList.add(student2);
        userList.add(teacher1);
        userList.add(teacher2);

        userList.sort(compStud);

        student1.print();
        teacher2.print();

    }

}
