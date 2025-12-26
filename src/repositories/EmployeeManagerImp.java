package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class EmployeeManagerImp implements CrudRepository<Employee> {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee findById(Integer id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee updateById(Integer id, Employee newEmployee) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employee.setName(newEmployee.getName());
                employee.setPassword(newEmployee.getPassword());
                employee.setPhoneNumber(newEmployee.getPhoneNumber());
                employee.setEmail(newEmployee.getEmail());
                employee.setCpf(newEmployee.getCpf());
                employee.setSalary(newEmployee.getSalary());
                employee.setRole(newEmployee.getRole());
                employee.setActive(newEmployee.getActive());
                return newEmployee;
            }
        }
        return null;
    }

    @Override
    public Employee deleteById(Integer id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employees.remove(employee);
                return employee;
            }
        }
        return null;
    }
}