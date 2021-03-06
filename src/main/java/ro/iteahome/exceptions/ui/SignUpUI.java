package ro.iteahome.exceptions.ui;

import ro.iteahome.exceptions.exception.*;
import ro.iteahome.exceptions.model.User;
import ro.iteahome.exceptions.service.UserService;
import ro.iteahome.exceptions.ui.validator.UserValidator;

import java.util.Scanner;

public class SignUpUI {

    private UserService userService = new UserService();
    private UserValidator userValidator = new UserValidator();

    public void displaySignUp() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are registering to the bike sharing system! Welcome among us!");
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        try {
            userValidator.validateUserCredentials(email, password);

            user.setEmail(email);
            user.setPassword(password);

            userService.signUp(user);
            System.out.println("User successfully registered: " + email);
        } catch (BikeSharingWrongCredentialsException e) {
            e.printStackTrace();
            System.out.println("Wrong Credentials");
        } catch (BikeSharingException e) {
            e.printStackTrace();
        }
    }
}
