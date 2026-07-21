package org.example;

import org.example.Database.Database;
import org.example.Database.MongoDb;
import org.example.Database.MySQLdb;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        SimpleFactory simpleFactory = new SimpleFactory();
        Database db = simpleFactory.getDatabase("mysql");
        UserService userService = new UserService(db);
        userService.login();
    }
}