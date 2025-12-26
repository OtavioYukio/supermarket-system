package services;

import java.util.List;

import entities.Employee;
import repositories.CrudRepository;
import repositories.EmployeeManagerImp;

public class EmployeeService {
    private CrudRepository<Employee> employeeManagerImp = new EmployeeManagerImp();

    public void save(Employee employee) {
        if (employee.getSalary() < 0) {
            throw new IllegalArgumentException("Invalid salary value");
        }
        if (employee.getPassword().length() < 8) {
            throw new IllegalArgumentException("The password must be greater than or equal to 8");
        }
        if (employee.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("The name cannot be null");
        }
        employeeManagerImp.save(employee);
        System.out.println("Employee saved successfully: " + employee);

    }

    public Employee findById(Integer id) {
        Employee returnedEmployee = employeeManagerImp.findById(id);
        if (returnedEmployee == null) {
            throw new IllegalArgumentException("id " + id + "does not exist");
        }
        return returnedEmployee;
    }

    public List<Employee> findAll() {
        return employeeManagerImp.findAll();
    }

    public void updateById(Integer id, Employee newEmployee) {
        if (newEmployee.getSalary() < 0) {
            throw new IllegalArgumentException("Invalid salary value");
        }
        if (newEmployee.getPassword().length() < 8) {
            throw new IllegalArgumentException("The password must be greater than or equal to 8");
        }
        if (newEmployee.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("The name cannot be null");
        }
        Employee returnedEmployee = employeeManagerImp.updateById(id, newEmployee);
        if (returnedEmployee == null) {
            throw new IllegalArgumentException("id " + id + "does not exist");
        }
        System.out.println("Employee updated successfully: " + newEmployee);
    }

    public void deleteById(Integer id) {
        Employee returnedEmployee = employeeManagerImp.deleteById(id);
        if (returnedEmployee == null) {
            throw new IllegalArgumentException("id " + id + "does not exist");
        }
        System.out.println("Employee deleted successfully: " + returnedEmployee);
    }
}