package sham.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import sham.model.dao.UserDao;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/users.html")
    public String users( ModelMap models )
    {
        models.put( "users", userDao.getAllUsers() );
        return "users";
    }

}