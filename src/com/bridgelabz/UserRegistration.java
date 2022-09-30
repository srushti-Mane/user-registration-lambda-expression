package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
        public boolean firstName(String firstName) {
            /**
             * Regex to check valid firstname
             * 1) First name starts with Cap and has minimum 3 characters
             */
            String  regex = "^[A-Z]{1}[a-z]{3,}";
            /**
             * First, the pattern is created using the Pattern.compile() method
             * The first parameter indicates which pattern is being searched for
             */
            Pattern pattern= Pattern.compile(regex);
            /**
             * The matcher() method is used to search for the pattern in a string.
             * It returns a Matcher object which contains information about the search that was performed.
             */
            Matcher match = pattern.matcher(firstName);
            /**
             * for return op is true or false
             */
            return match.matches();
        }
     }

