package Seminar.Seminar76.model.service;

import Seminar.Seminar6.model.data.Student;
import Seminar.Seminar6.model.data.Teacher;

import java.util.ArrayList;
import java.util.Calendar;

public interface DataService {
  Student createStudent(String name, String lastName, Calendar birthday);

  Teacher createTeacher(String name, String lastName, Calendar birthday);

  ArrayList<Teacher> getTeacherList();

  ArrayList<Student> getStudentList();
}