package ro.iteahome.exceptions.ui;

import java.util.Scanner;

public class MainUI {

    private LoginUI loginUI = new LoginUI();
    private SignUpUI signUpUI = new SignUpUI();


    public void start() {
        //loginUI.displayLogin();
        signUpUI.displaySignUp();
    }
}
