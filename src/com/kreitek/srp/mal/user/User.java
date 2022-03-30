package com.kreitek.srp.mal.user;

public class User {

    private String login;
    private String firstName;
    private String lastName;
    private String email;

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
        validateEmailAddress(email);
        this.email = email;
    }

    public void validateEmailAddress(String email) {
        if (email == null || "".equals(email)) {
            throw new RuntimeException("Email no válido");
        }
    }

    public void sendEmail(String subject, String text) {
        // Código para enviar un correo
    }
}
