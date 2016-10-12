package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        String inputString = m.readInput();
        String[] separatedWords = m.splitString(inputString);
        m.reverseWords(separatedWords);
    }

    private void reverseWords(String[] stringArray) {
        int index;
        for (String string : stringArray) {
            for (int i = 0; i < string.length(); i++) {
                index = string.length() - 1 - i;
                System.out.print(string.charAt(index));
            }
            System.out.print(" ");
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
