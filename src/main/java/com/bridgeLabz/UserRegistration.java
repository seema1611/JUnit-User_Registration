package com.bridgeLabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{3,}$",firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{3,}$",lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches("^[A-Za-z]{3,}([.|+|_|-]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4}+)?$",email);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches("^[0-9]{1,3}[ ][1-9]{1}[0-9]{9}$",mobileNumber);
    }

    public boolean validateFirstPassword(String firstPassword) {
        return Pattern.matches("^[A-za-z]{8,}$",firstPassword);
    }
}
