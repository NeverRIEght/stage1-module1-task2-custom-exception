package com.epam.mjc;

public class StudentException extends IllegalArgumentException {
    StudentException(long studentID) {
        super("Could not find student with ID " + studentID);
    }
}