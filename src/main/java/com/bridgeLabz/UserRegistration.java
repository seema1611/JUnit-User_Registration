package com.bridgeLabz;

import java.util.regex.Pattern;

public class UserRegistration {
    String firstNamePattern="^[A-Z]{1}[a-z]{3,}$";
    String lastNamePattern="^[A-Z]{1}[a-z]{3,}$";
    String emailPattern="^[A-Za-z]{3,}([.|+|_|-]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4}+)?$";
    String mobileNumberPattern="^[0-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
    String passwordPattern="^(?=[^@|#|$|%|!|&]*[@|#|$|%|!|&][^@|#|$|%|!|&]*$)(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9@#$%!&]{8,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(firstNamePattern,firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(lastNamePattern,lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(emailPattern,email);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches(mobileNumberPattern,mobileNumber);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches(passwordPattern,password);
    }
}
