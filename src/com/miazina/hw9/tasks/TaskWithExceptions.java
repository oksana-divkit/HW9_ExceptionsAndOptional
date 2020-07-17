package com.miazina.hw9.tasks;

import com.miazina.hw9.exceptions.*;

import java.io.IOException;

public class TaskWithExceptions {
    public void start() {
        try {
            throw new ExceptionA("Exception A");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionB("Exception B");
        } catch (ExceptionB e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new NullPointerException("NullPointerException");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IOException("IOException");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
