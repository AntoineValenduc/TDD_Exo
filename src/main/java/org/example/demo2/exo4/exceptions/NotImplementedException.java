package org.example.demo2.exo4.exceptions;

import jdk.jshell.spi.ExecutionControl;

public class NotImplementedException extends RuntimeException {

    public NotImplementedException() {
        super("Cette fonctionnalité n'est pas encore implémentée.");
    }

    public NotImplementedException(String message) {
        super(message);
    }
}
