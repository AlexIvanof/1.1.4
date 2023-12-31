package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 23);
        userService.saveUser("Петр", "Петров", (byte) 26);
        userService.saveUser("Алексей", "Алексеев", (byte) 55);
        userService.saveUser("Николай", "Никлолаев", (byte) 34);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}


