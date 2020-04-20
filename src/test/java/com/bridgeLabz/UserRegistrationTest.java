package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateFirstName("Seema"));
    }

    @Test
    public void givenFirstName_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateFirstName("SeeMa"));
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateLastName("Rajpure"));
    }

    @Test
    public void givenLastName_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateLastName("RajPure"));
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateEmail("seemarajpure16@gmail.co.in"));
    }
    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateEmail("SeeMaRajpure16@gmail.16.com"));
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateMobileNumber("91 8957452345"));
    }
    @Test
    public void givenMobileNumber_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateMobileNumber("91 0957452345"));
    }

    @Test
    public void givenMinimum8CharacterPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateFirstPassword("SeemaRajpure"));
    }

    @Test
    public void givenMinimum8CharacterPassword_WhenNotValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateFirstPassword("seeMA"));
    }

    @Test
    public void givenMinimum1UppercasePassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateSecondPassword("SeemaRajpure"));
    }

    @Test
    public void givenMinimum1UppercasePassword_WhenNotValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateSecondPassword("seemayuugjhjkh"));
    }

    @Test
    public void givenMinimum1NumericPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateThirdPassword("SeemaRajpure16"));
    }

    @Test
    public void givenMinimum1NumericPassword_WhenNotValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateThirdPassword("seemarajpure"));
    }
}
