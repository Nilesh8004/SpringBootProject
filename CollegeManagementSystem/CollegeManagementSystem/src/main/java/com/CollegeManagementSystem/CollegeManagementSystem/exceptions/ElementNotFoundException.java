package com.CollegeManagementSystem.CollegeManagementSystem.exceptions;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ElementNotFoundException extends RuntimeException{


    public ElementNotFoundException(String msg)
    {
        super(msg);
    }
}