/*
* UCF COP 3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Rahel Haque
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%s", "What is your name? ");
        Scanner name = new Scanner(System.in);
        String str = name.nextLine();
        System.out.printf("Hello, %s, nice to meet you", str);
    }
}