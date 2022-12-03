package registration_main.userData;

import registration_main.userData.exceptions.WrongLoginException;
import registration_main.userData.exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class Data {

    private String login;
    private String password;
    private final String confirmPassword;

    public Data(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        this.login = checkLogin(login);
        this.password = checkPassword(password);
        this.confirmPassword = checkConfirmPassword(confirmPassword);
    }
    public void login(String login, String password) {
        if (login.equals(this.login) && password.equals(this.password)) {
            System.out.println("access is allowed :)");
        } else System.out.println("access denied :(");
    }
    private String checkLogin(String login) throws WrongLoginException {
        if (login == null || login.isEmpty() || login.isBlank() || login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть от 1 до 20 символов");
        } else if (!validateEntrySymbols(login)) {
            throw new WrongLoginException("Логин содержит в себе только латинские буквы, цифры и знак подчеркивания");
        } else
            return login;
    }

    private String checkPassword(String password) throws WrongPasswordException {
        if (password == null || password.isEmpty() || password.isBlank() || password.length() > 20) {
            throw new WrongPasswordException("Длина пароля должна быть от 1 до 20 символов");
        } else if (!validateEntrySymbols(password)) {
            throw new WrongPasswordException("Пароль содержит в себе только латинские буквы, цифры и знак подчеркивания");
        } else
            return password;
    }

    private String checkConfirmPassword(String confirmPassword) throws WrongPasswordException {
        if (!confirmPassword.equals(this.password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        } else return confirmPassword;
    }

    private boolean validateEntrySymbols(String login) {
        return Pattern.matches("^[a-zA-Z0-9_]{1,20}$", login);
    }
}