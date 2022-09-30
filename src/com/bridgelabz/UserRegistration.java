package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
        public boolean firstName(String firstName) {
            String  regex = "^[A-Z]{1}[a-z]{3,}";
            Pattern pattern= Pattern.compile(regex);
            Matcher match = pattern.matcher(firstName);
            /**
             * for return op is true or false
             */
            return match.matches();
        }
        public boolean lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        /**
         * Return if the userlastname matched the Regex
         */
        return matcher.matches();
    }
}

