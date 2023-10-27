package org.dz17;


import java.util.regex.Pattern;

public enum RegularExpressions {
        PHONE_NUMBER("^\\+?[0-9]{1,4}-?[0-9]{3,14}$"),
        PERSON_NAME( "^(?:[A-Za-z]+\\s?)+$"),

        EMAIL("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        private final String regex;

        RegularExpressions(String regex) {
            this.regex = regex;
        }

        public Pattern getPattern() {
            return Pattern.compile(this.regex);
        }
    }

