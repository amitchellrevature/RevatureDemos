package com.alec.day3;

class EmployeeException extends RuntimeException{

}

public class Demo19 {
    public static void main(String[] args) {
        throw new EmployeeException();
    }
}
