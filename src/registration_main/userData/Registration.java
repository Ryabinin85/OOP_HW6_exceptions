package registration_main.userData;

import registration_main.userData.exceptions.WrongLoginException;
import registration_main.userData.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login;
        String password;
        String confirmPassword;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Login");
        login = scanner.next();
        System.out.println("Enter Password");
        password = scanner.next();
        System.out.println("Confirm password");
        confirmPassword = scanner.next();

        Data userData = new Data(login, password, confirmPassword);

        System.out.println("registration success");
        System.out.println("====================");

        String entryLogin;
        String entryPassword;

        System.out.println("Enter Login");
        entryLogin = scanner.next();
        System.out.println("Enter Password");
        entryPassword = scanner.next();

        userData.login(entryLogin, entryPassword);

    }
}