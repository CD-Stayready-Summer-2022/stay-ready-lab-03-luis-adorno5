package com.codedifferently.phonebook;

import com.codedifferently.exceptions.PersonNotFoundException;
import com.codedifferently.person.Person;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {

    private ArrayList<Person> people;

    public PhoneBook() {
        people = new ArrayList<>();
    }

    public Integer getNumberOfPeople() {
        return people.size();
    }

    public void addPersonToPhoneBook(Person person) {
        people.add(person);
    }

    public Person findPersonByName(String firstName, String lastName)
            throws PersonNotFoundException {
        for(Person person : people){
            if(person.getFirstName().equals(firstName) && person.getLastName().equals(lastName))
                return person;
        }
        String error = String.format("Person with the following values not found: First Name: %s, Last Name: %s",
                firstName, lastName);
        throw new PersonNotFoundException(error);
    }
}
