package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration obj=new UserRegistration();
    @Test
    public void given_FirstName_Is_Valid_Or_Not()
    {
        boolean  name = obj.firstName("Vishlesha");
        Assertions.assertTrue((name));
    }
}
