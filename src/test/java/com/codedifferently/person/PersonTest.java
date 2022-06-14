package com.codedifferently.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Parameterized constructor test.")
    public void constructorTest01(){
        //Given
        Person person = new Person("Luis",
                "Adorno", "123-456-7891");
        //When
        String expected = "Luis Adorno 123-456-7891";
        String actual = person.toString();
        //Then
        Assertions.assertEquals(expected, actual);
    }

}
