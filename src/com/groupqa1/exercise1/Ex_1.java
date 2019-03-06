package com.groupqa1.exercise1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter text: ");

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        int index = 0;
        while (index < str.length()) {
            if (numberOfRepetitions(str, str.charAt(index)) == 1) {
                System.out.print(str.charAt(index));
            }
            index++;
        }
    }

    static int numberOfRepetitions(String str, char symbol) {
        int count = 0, index = 0;

        while (index < str.length()) {
            if (str.charAt(index) == symbol) {
                count++;
            }
            index++;
        }
        return count;
    }
}
