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

    @Test
    public void given_LastName_Is_Valid_Or_Not()
    {
        boolean lastName = obj.lastName("Mortale");
        Assertions.assertTrue((lastName));
    }

    @Test
    public void given_MailID_Is_Valid_Or_Not()
    {
        boolean mailId = obj.mailId("vish.mor@bl.co.in");
        Assertions.assertTrue((mailId));
    }

    @Test
    public void given_PhoneNumber_Is_Valid_Or_Not()
    {
        boolean phoneNumber = obj.phoneNumber("91 9876543210");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void given_PasswordHas_Minimum_8Characters()
    {
        boolean password=obj.password("passwordss");
        Assertions.assertTrue(password);
    }


    @Test
    public void given_Password_Has_Minimum_Eight_Characters_And_One_UpperCaseLetter()
    {
        boolean password = obj.passwordWithOneUpperCaseLetter("passWordss");
        Assertions.assertTrue(password);
    }

    @Test
    public void given_Password_Has_Minimum_Eight_Characters_And_Atleast_One_UpperCaseLetter_And_One_Number()
    {
        Assertions.assertEquals(true,obj.passwordWithOneUpperCaseLetterAndOneNumericNumber("passworD7"));
    }
}
