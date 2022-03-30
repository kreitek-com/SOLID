package com.kreitek.srp.bien.user;

public class EmailValidator {
    public EmailValidator() {
    }

    public void validate(String email) {
        if (email == null || "".equals(email)) {
            throw new RuntimeException("Email no válido");
        }
    }
}