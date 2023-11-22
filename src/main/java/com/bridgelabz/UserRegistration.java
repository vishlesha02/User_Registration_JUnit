package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface ValidateUserRegistration{
    boolean validDetails(String userDetails);
}
public class UserRegistration {

    public static boolean firstName(String firstName) {
        ValidateUserRegistration validateName = name -> Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}", name);

        try {
            if (validateName.validDetails(firstName)) {
                return true;
            } else {
                throw new UseRegistrationException("Invalid UserName---------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static boolean lastName(String lastName) {
        ValidateUserRegistration validateLastName = userLastName -> Pattern.matches("[A-Z]{1}[a-zA-z]{2,}",userLastName);

        try {
            if (validateLastName.validDetails(lastName))
                return true;

            else {
                throw new UseRegistrationException("Inavlid Last Name");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static boolean mailId(String mailId) {
        ValidateUserRegistration validateMailId = userMailId -> Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$",userMailId);
        try {
            if (validateMailId.validDetails(mailId)) {
                System.out.println("Valid Mail Id");
                return true;
            } else {
                throw new UseRegistrationException("Invalid Mail Id");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


    public static boolean phoneNumber(String phoneNumber) {

        ValidateUserRegistration validatePhoneNumber = userPhoneNumber -> Pattern.matches("^91\\s\\d{10}$", userPhoneNumber);
        try {
            if (validatePhoneNumber.validDetails(phoneNumber))
                return true;

            else {
                throw new UseRegistrationException("Invalid Phone Number");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static boolean password(String password) {
        ValidateUserRegistration validatePassword = userPassword -> Pattern.matches("[a-z]{8,}", userPassword);

        try {
            if (validatePassword.validDetails(password)) {
                return true;
            } else {
                throw new UseRegistrationException("Minimum 8 Characters required");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean passwordWithOneUpperCaseLetter(String password) {
        ValidateUserRegistration validatePassword = userPassword -> Pattern.matches("^(?=.*[A-Z])[A-Za-z]{7,}$", userPassword);

        try {
            if (validatePassword.validDetails(password)) {
                return true;
            }
            else {
                throw new UseRegistrationException("One Letter needs to be Uppercase");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean passwordWithOneUpperCaseLetterAndOneNumericNumber(String password) {

        ValidateUserRegistration validatePassword = userPassword -> Pattern.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{6,}$", userPassword);
        try
        {
             if(validatePassword.validDetails(password))
                 return true;
            else {
                throw new UseRegistrationException("Atleast One Numberic number required");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean passwordWithAtleastOneUpperCaseLetterAndOneNumberAndExactlyOneSpecialCharacter(String password)
    {
        ValidateUserRegistration validatePassword = userPassword -> Pattern.matches("^(?=(.*[A-Z]))(?=(.*\\d))(?=(.*[!@#$%^&*]))[A-Za-z\\d!@#$%^&*]{6,20}$", userPassword);

        try{
            if(validatePassword.validDetails(password))
                return true;
            else {
                throw new UseRegistrationException("Exactly one special character required");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }


}

