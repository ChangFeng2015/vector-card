package com.qiqilab.exception;

public class EmployeeNotExistException extends RuntimeException {

    private static final long serialVersionUID = -6112780192479543543L;
    private int id;

    public EmployeeNotExistException(int id) {
        super("employee not exist!");
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
