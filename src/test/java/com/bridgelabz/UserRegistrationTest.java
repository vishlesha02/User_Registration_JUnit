package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {
    UserRegistration obj=new UserRegistration();
    @Test
    public void given_FirstName_Is_Valid_Or_Not()
    {
        boolean  name = UserRegistration.firstName("Vishlesha");
        Assertions.assertTrue((name));
    }

    @Test
    public void given_LastName_Is_Valid_Or_Not()
    {
        boolean lastName = UserRegistration.lastName("Mortale");
        Assertions.assertTrue((lastName));
    }

    @Test
    public void given_MailID_Is_Valid_Or_Not()
    {
        boolean mailId = UserRegistration.mailId("vish.mor@bl.co.in");
        Assertions.assertTrue((mailId));
    }

    @Test
    public void given_PhoneNumber_Is_Valid_Or_Not()
    {
        boolean phoneNumber = UserRegistration.phoneNumber("91 9876543210");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void given_PasswordHas_Minimum_8Characters()
    {
        boolean password=UserRegistration.password("passwordss");
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

    @Test
    public void given_Password_Has_Minimum_Eight_Characters_And_Atleast_One_UpperCaseLetter_And_One_Number_And_Exactly_One_SpecialCharacter()
    {
        Assertions.assertEquals(true,obj.passwordWithAtleastOneUpperCaseLetterAndOneNumberAndExactlyOneSpecialCharacter("PAsswordss@8"));
    }

    @ParameterizedTest
    @CsvSource({
            "abc,false",
            "abc@.com.my,true",
            "abc123@gmail.a,false",
            "abc123@.com, false",
            "abc123@.com.com, true",
            ".abc@abc.com, true",
            "abc()*@gmail.com, false",
            "abc@%*.com, false",
            "abc..2002@gmail.com, true",
            "abc.@gmail.com, true",
            "abc@abc@gmail.com, false",
            "abc@gmail.com.1a, false",
            "abc@gmail.com.aa.au, true"
    })
    public void testGivenInValidEmails(String email, boolean expected){
        boolean res = UserRegistration.mailId(email);
        Assertions.assertEquals(expected,res);
    }

}
