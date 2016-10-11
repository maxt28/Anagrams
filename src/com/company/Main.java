package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        String inputString = m.readInput();
        String[] separatedWords = m.splitString(inputString);
        m.reverseWords(separatedWords);
    }

    private void reverseWords(String[] stringArray) {
        for (String string : stringArray) {
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.reverse();
            System.out.print(stringBuilder + " ");
        }
    }

    private String[] splitString(String string) {
        return string.split("\\s+");
    }

    private String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
