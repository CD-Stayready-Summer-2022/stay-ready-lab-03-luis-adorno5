package com.codedifferently;

import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Integer value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite number:");
        try {
            value = scanner.nextInt();
        }catch (Exception ex){
            System.out.println("Since you cannot follow instructions I will pick a number for you");
            value = 42;
        }
        System.out.println("You selected the following number: " + value);
    }
}
