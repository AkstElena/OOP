package Seminar.Seminar5.model.service;

import java.util.Calendar;
import java.util.List;

import Seminar.Seminar5.model.data.User;

public class UserService<T extends User> implements DateService<T> {

  @Override
  public T createUser(int id, String name, String lastName, Calendar birthDay) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createUser'");
  }

  @Override
  public List<T> readDate() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'readDate'");
  }

}
