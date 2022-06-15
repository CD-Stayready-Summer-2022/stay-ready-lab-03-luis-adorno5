package com.codedifferently.linkedlist;

import org.junit.jupiter.api.*;

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
    public void getFailTest01(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->{
            nums.get(-1);
        });
    }

}
