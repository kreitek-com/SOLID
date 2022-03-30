package com.kreitek.srp.bien.user;

public class User {

    private final EmailValidator emailValidator;
    private String login;
    private String firstName;
    private String lastName;
    private String email;

    public User(EmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        emailValidator.validate(email);
        this.email = email;
    }


}
