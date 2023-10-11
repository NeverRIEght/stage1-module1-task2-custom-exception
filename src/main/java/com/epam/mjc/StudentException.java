package com.epam.mjc;

public class StudentException extends IllegalArgumentException {
    StudentException(String message) {
        super(message);
    }
}