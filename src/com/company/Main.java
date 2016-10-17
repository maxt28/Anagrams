package com.company;

import java.util.Scanner;

public class Main {
    private static final String SPACE_CHAR = "\\s+";
    private static final int ARRAY_START_INDEX = 0;

    public static void main(String[] args) {
        Main main = new Main();
        String inputString = main.readInput();
        String[] separatedWords = main.splitString(inputString);
        main.reverseWords(separatedWords);
    }

    private void reverseWords(String[] stringArray) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String string : stringArray) {
            stringBuffer.insert(ARRAY_START_INDEX, string);
            System.out.print(stringBuffer.reverse() + " ");
            stringBuffer.delete(ARRAY_START_INDEX, stringBuffer.length());
        }
    }

    private String[] splitString(String string) {
        return string.split(SPACE_CHAR);
    }

    private String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
