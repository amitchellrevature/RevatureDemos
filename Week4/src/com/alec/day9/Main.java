package com.alec.day9;

import java.sql.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {

            System.out.println("********************************");
            System.out.println("Select from the options below");
            System.out.println("********************************");
            System.out.println("PRESS 1 - Add Employee");
            System.out.println("PRESS 2 - Update Employee");
            System.out.println("PRESS 3 - Delete Employee");
            System.out.println("PRESS 4 - Read Employee");
            System.out.println("PRESS 5 - Read Employee By Id");
            System.out.println("PRESS 6 - Exit");
            System.out.println("********************************");

            int input = scanner.nextInt();

            switch (input) {
                case 1: {
                    // add
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee();
                    employee.setName(name);
                    employee.setEmail(email);
                    dao.addEmployee(employee);
                    break;
                }
                case 2: {
                    // update
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee(id, name, email);
                    dao.updateEmployee(employee);
                    break;
                }
                case 3:
                    // delete
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 4:
                    // get all
                    List<Employee> employees = dao.getEmployees();
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 5:
                    // get by id
                    System.out.print("Enter Id: ");
                    int empId = scanner.nextInt();
                    Employee employee = dao.getEmployeeById(empId);
                    System.out.println(employee);
                    break;
                case 6:
                    // exit
                    System.out.println("Thank you");
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Choose between 1 - 6");
            }
        }
    }
}
