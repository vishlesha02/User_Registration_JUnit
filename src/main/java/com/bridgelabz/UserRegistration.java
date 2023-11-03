package com.bridgelabz;

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
}

