package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
        UserRegistration userRegistration = new UserRegistration();

    /**
     * test case for UC1
     */
    @Test
        public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
            boolean result = userRegistration.firstName("Srushti");
            Assertions.assertEquals(true, result);
        }

        @Test
        public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
            boolean result =userRegistration.firstName("srushti");
            Assertions.assertEquals(false, result);
        }
    /**
     * test case for uc2
     */
    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Mane");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("mane");
        Assertions.assertEquals(false, result);

    }
    /**
     * test case for uc3 email
     */
    @Test
    public void givenEmail_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.emailAddress("abc@gmail.com.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.emailAddress("abc()*@gmail.com");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for uc4 Mobile no.
     */
    @Test
    public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 9689509560");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 8830029319");
        Assertions.assertEquals(false, result);
    }
    /**
     * test case for UC5 password rule 1(min 8 chara)
     */
    @Test
    public void givenPassword_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule1("registration");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule1("reg");
        Assertions.assertEquals(false, result);
    }

}





