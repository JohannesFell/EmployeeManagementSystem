package com.jf.ems.service;

import com.jf.ems.entity.Employee;
import com.jf.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee)
    {
        return repository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees)
    {
        return repository.saveAll(employees);
    }

    public List<Employee> getEmployee()
    {
        return repository.findAll();
    }

    public Employee getEmployeeById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "Employee removed: " + id;
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = repository.findById(employee.getEmpID()).orElse(null);
        existingEmployee.setEmpFirstName(employee.getEmpFirstName());
        existingEmployee.setEmpLastName(employee.getEmpLastName());
        existingEmployee.setEmpBirthDate(employee.getEmpBirthDate());
        existingEmployee.setEmpDepartment(employee.getEmpDepartment());
        return repository.save(existingEmployee);
    }
}
