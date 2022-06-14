package com.codedifferently.exceptions;

import com.codedifferently.person.Person;

public class PersonNotFoundException extends Exception{
    public PersonNotFoundException(){
    }

    public PersonNotFoundException(String msg){
        super(msg);
    }
}
