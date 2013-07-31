package sham.model.dao;

import java.util.List;

import sham.model.User;

public interface UserDao {

    User getUserById( Integer id );

    List<User> getAllUsers();

}