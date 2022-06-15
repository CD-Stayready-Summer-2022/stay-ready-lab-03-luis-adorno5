package com.codedifferently.linkedlist;

import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> nums;
    Integer newNum;

    @BeforeEach
    public void init(){
        nums = new SinglyLinkedList<>(new Node<>(1));
        newNum = 2;
    }

    @Test
    @DisplayName("Parameterized constructor test.")
    public void constructorTest01(){
        int expected = 1;
        int actual = nums.get(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("add method test.")
    public void addMethodTest(){
        nums.add(2);
        int expected = 2;
        int actual = nums.get(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("add method fail test.")
    public void addMethodFailTest01(){
        Assertions.assertThrows(NullPointerException.class, ()->{
            nums.add(null);
        });
    }

    @Test
    @DisplayName("get method fail test.")
    public void getMethodFailTest01(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->{
            nums.get(-1);
        });
    }

    @Test
    @DisplayName("remove method test.")
    public void removeMethodTest01(){
        Boolean expected = true;
        Boolean actual = nums.remove(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("remove method test.")
    public void removeMethodTest02(){
        nums.add(2);
        nums.add(3);
        Boolean expected = true;
        Boolean actual = nums.remove(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("remove method test fail.")
    public void removeMethodFailTest01(){
        Assertions.assertThrows(NoSuchElementException.class, ()->{
            nums.remove(10);
        });
    }

}
