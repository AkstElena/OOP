package Seminar.Seminar76.model.service;

import Seminar.Seminar6.model.data.DataBase;
import Seminar.Seminar6.model.data.Student;
import Seminar.Seminar6.model.data.Teacher;
import Seminar.Seminar6.model.data.User;

import java.util.ArrayList;
import java.util.Calendar;

public class UserService implements DataService {
  private static final DataBase db = new DataBase();

  @Override
  public Student createStudent(String name, String lastName, Calendar birthday) {
    Student student = new Student(name, lastName, birthday);
    db.addInDB(student);
    return student;
  }

  @Override
  public Teacher createTeacher(String name, String lastName, Calendar birthday) {
    Teacher teacher = new Teacher(name, lastName, birthday);
    db.addInDB(teacher);
    return teacher;
  }

  public ArrayList<Teacher> getTeacherList() {
    ArrayList<User> usrList = db.getDb();
    ArrayList<Teacher> teachers = new ArrayList<>();
    for (User usr : usrList) {
      if (usr instanceof Teacher)
        teachers.add((Teacher) usr);
    }
    return teachers;
  }

  public ArrayList<Student> getStudentList() {
    ArrayList<User> usrList = db.getDb();
    ArrayList<Student> students = new ArrayList<>();
    for (User usr : usrList) {
      if (usr instanceof Student)
        students.add((Student) usr);
    }
    return students;

  }
}