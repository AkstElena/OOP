package Seminar.Seminar5.model.service;

import java.util.Calendar;
import java.util.List;

import Seminar.Seminar5.model.data.User;

public interface DateService<T extends User> {

  T createUser(int id, String name, String lastName, Calendar birthDay);

  List<T> readDate();

}
