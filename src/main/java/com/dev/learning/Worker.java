package com.dev.learning;

public class Worker {
    private int workerId;
    private String firstName;
    private String lastName;
    private int salary;
    private String department;

    // constructor
    public Worker(int workerId, String firstName, String lastName,
                  int salary, String department) {
        this.workerId = workerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    // getters (optional for now)
    public int getWorkerId() { return workerId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSalary() { return salary; }
    public String getDepartment() { return department; }
}
