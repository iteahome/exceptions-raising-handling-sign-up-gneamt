package ro.iteahome.exceptions.dao;

import ro.iteahome.exceptions.exception.BikeSharingFileException;
import ro.iteahome.exceptions.exception.BikeSharingTechnicalException;
import ro.iteahome.exceptions.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static final String USERS_FILE = "src/main/resources/users.txt";

    public List<User> readAllUsers() throws BikeSharingTechnicalException {
        List<User> userList = new ArrayList<>();
        try (BufferedReader userReader = new BufferedReader(new FileReader(USERS_FILE))) {
            String userLine = userReader.readLine();
            String[] userValues = userLine.split(";");
            userList.add(new User(userValues[0], userValues[1]));
        } catch (IOException e) {
            throw new BikeSharingFileException("Error reading users", e);
        }
        return userList;
    }
}
