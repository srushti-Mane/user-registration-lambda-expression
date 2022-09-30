package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
        UserRegistration userRegistration = new UserRegistration();

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
}


