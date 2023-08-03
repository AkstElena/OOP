package Seminar.Seminar5.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Seminar.Seminar5.model.data.Student;

public class UserView {

  public addStudent() {
    Scanner scan = new Scanner(System.in);
    int inCommand;
    String name;
    String lastName;
    // String temp;
    String [] tempDate;
    Calendar birthDay;
    boolean noExit = true;
    while (noExit) {
      System.out.println("Выбор типа пользователя: ");
      System.out.println("1 Учитель ");
      System.out.println("2 Студент ");
      System.out.println("0 Выход");
      inCommand = scan.nextInt();
      if (inCommand == 1) {
              System.out.println("Имя");
              name = scan.nextLine();
              System.out.println("Фамилия");
              lastName = scan.nextLine();
              System.out.println("День рождения в формате: Год/Месяц/День");
              tempDate =scan.nextLine().split("/");
              birthDay = new GregorianCalendar(((Int)tempDate[0]), ((Int) tempDate[1]),((Int) tempDate[2]));
              ;
      }

    }

}

}
