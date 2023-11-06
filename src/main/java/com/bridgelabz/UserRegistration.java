package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

        public boolean firstName(String name)  {

            try {
                if (Pattern.matches("[A-Z]{1}[a-zA-z]{2,}", name)) {
                    return true;
                 }
                else {
                    throw new UseRegistrationException("Invalid UserName---------------");
                }
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            return false;
        }

    public boolean lastName(String lastName) {

        try {
            if(Pattern.matches("[A-Z]{1}[a-zA-z]{2,}", lastName))
                return true;

            else {
                throw new UseRegistrationException("Inavlid Last Name");
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean mailId(String mailId) {
            try{
                if(Pattern.matches("^[a-z]{2,}\\.[a-z]{3,}?@(bl)\\.(co)(\\.in)?$", mailId))
                {
                    return true;
                }
                else {
                    throw new UseRegistrationException("Invalid Mail Id");
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            return false;
    }


    public boolean phoneNumber(String phoneNumber) {

        try
        {
            if (Pattern.matches("^91\\s\\d{10}$", phoneNumber))
                return true;

            else
            {
                throw new UseRegistrationException("Invalid Phone Number");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean password(String password) {
        try
        {
            if(Pattern.matches("[a-z]{8,}", password))
            {
                return true;
            }
            else {
                throw new UseRegistrationException("Minimum 8 Characters required");

            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }

}

