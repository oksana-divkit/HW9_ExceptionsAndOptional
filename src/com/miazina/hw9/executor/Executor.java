package com.miazina.hw9.executor;

import com.miazina.hw9.tasks.*;

public class Executor {
    public static void start() {
        new CatchingExample().start();
        new SafeDivision().start();
        new RethrowingExample().start();
    }
}
