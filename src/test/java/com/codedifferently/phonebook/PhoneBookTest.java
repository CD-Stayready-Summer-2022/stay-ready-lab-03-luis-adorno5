package com.codedifferently.phonebook;

import com.codedifferently.exceptions.PersonNotFoundException;
import com.codedifferently.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    PhoneBook phoneBook;
    Person person;

    @BeforeEach
    public void init(){
        phoneBook = new PhoneBook();
        person = new Person("Luis",
                "Adorno", "123-456-7891");
    }

    @Test
    @DisplayName("Non-parameterized constructor test.")
    public void constructorTest01(){
        int expectedSize = 0;
        int actualSize = phoneBook.getNumberOfPeople();
        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Add person test.")
    public void addPersonTest() throws PersonNotFoundException{
        phoneBook.addPersonToPhoneBook(person);
        Person actualPerson =
                phoneBook.findPersonByName("Luis", "Adorno");
        Assertions.assertEquals(person, actualPerson);
    }

    @Test
    @DisplayName("findPersonByName test.")
    public void findPersonByName01() throws PersonNotFoundException {
        phoneBook.addPersonToPhoneBook(person);
        Person actualPerson = phoneBook.findPersonByName("Luis", "Adorno");
        Assertions.assertEquals(person, actualPerson);
    }

    @Test
    @DisplayName("findPersonByName fail test.")
    public void findPersonByNameTestFail(){
        Assertions.assertThrows(PersonNotFoundException.class, ()->{
            phoneBook.findPersonByName("Luis", "Adorno");
        });
    }

}
