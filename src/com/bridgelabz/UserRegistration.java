package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
        public static boolean firstName(String firstName) {
            String  regex = "^[A-Z]{1}[a-z]{3,}";
            Pattern pattern= Pattern.compile(regex);
            Matcher match = pattern.matcher(firstName);
            /**
             * for return op is true or false
             */
            return match.matches();
        }
        public static boolean lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        /**
         * Return if the userlastname matched the Regex
         */
        return matcher.matches();
    }
    public static boolean emailAddress(String email) {
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean phoneNumber(String phoneNumber) {
        /**
         * 1) Country code follow by space and 10 digit number
         */
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

