package Seminar.Seminar76.controller;

import Seminar.Seminar6.model.data.Student;
import Seminar.Seminar6.model.data.Teacher;
import Seminar.Seminar6.model.service.DataService;
import Seminar.Seminar6.model.service.UserService;

import java.util.ArrayList;
import java.util.Calendar;

public class Controller {
  private DataService service = new UserService();

  public Student createNewStudent(String name, String lastName, Calendar birthday) {
    return service.createStudent(name, lastName, birthday);
  }

  public Teacher createNewTeacher(String name, String lastName, Calendar birthday) {
    return service.createTeacher(name, lastName, birthday);
  }

  public ArrayList<Teacher> showTeacher() {
    return service.getTeacherList();
  }

  public ArrayList<Student> showStudent() {
    return service.getStudentList();
  }

}