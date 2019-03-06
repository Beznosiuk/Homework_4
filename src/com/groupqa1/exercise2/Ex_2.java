package com.groupqa1.exercise2;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Number in binary system: " + inBinarySystem(number));

    }

    static String inBinarySystem(int number) {
        String str = "";
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            int remainder = number % 2;
            str = remainder + str;
            number = number / 2;
        }

        return str;
    }
}
