package com.miazina.hw9.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SafeDivision {
    int a;
    int b;

    public void start() {
        printMsg("Please, enter first integer:");
        a = getNumberFromUser();

        while (true) {
            printMsg("Please, enter second integer:");
            b = getNumberFromUser();

            try {
                printMsg("Your results:");
                printMsg(String.format("%d / %d = %d", a, b, a / b));
                break;
            } catch (ArithmeticException e) {
                printMsg("Ohh no, you can't divide by zero! Try again...");
            }
        }
    }

    private void printMsg(String msg) {
        System.out.println("\n" + msg);
    }

    private int getNumberFromUser() {
        int num;

        while (true) {
            try {
                num = readInt();
                break;
            } catch (NumberFormatException e) {
                printMsg("Sorry, this is not a number... Try again");
            }
        }
        return num;
    }

    private int readInt() throws NumberFormatException {
        int num = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferedReader.readLine();
            num = Integer.parseInt(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return num;
    }
}
