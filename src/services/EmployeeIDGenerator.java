package services;

import java.util.List;

import entities.Employee;

public class EmployeeIDGenerator extends IDGenerator<Employee> {
    @Override
    public Integer generateId(List<Employee> employees) {
        return (employees.get(employees.size() - 1).getId()) + 1;
    }
}
