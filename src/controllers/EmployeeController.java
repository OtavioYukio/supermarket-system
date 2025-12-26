package controllers;

import services.EmployeeService;

import java.util.List;

import entities.Employee;
import entities.Role;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    public void save(String name, String password, String phoneNumber,
                    String email, String cpf, Double salary, Role role) {
        Employee employee = new Employee(name, password, phoneNumber, email, cpf, salary, role);
        employeeService.save(employee);
    }

    public Employee findById(Integer id) {
        return employeeService.findById(id);
    }

    public List<Employee> findAll() {
        return employeeService.findAll();
    } 

    public void updateById(Integer id, String name, String password, String phoneNumber,
                    String email, String cpf, Double salary, Role role) {
        Employee employee = new Employee(name, password, phoneNumber, email, cpf, salary, role);
        employeeService.updateById(id, employee);
    }

    public void deleteById(Integer id) {
        employeeService.deleteById(id);
    }
}
