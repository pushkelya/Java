package com.groupqal.test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
    }
}
