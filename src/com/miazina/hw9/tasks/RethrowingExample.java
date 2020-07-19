package com.miazina.hw9.tasks;

import com.miazina.hw9.exceptions.ExceptionA;

public class RethrowingExample {

    public void start() {
        System.out.println("\n9.3 Rethrowing exceptions.");

        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void someMethod() throws Exception {
        someMethod2();
    }

    private void someMethod2() throws Exception {
        throw new Exception("I'm from someMethod2!");
    }
}
