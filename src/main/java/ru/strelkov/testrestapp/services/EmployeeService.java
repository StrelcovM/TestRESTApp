package ru.strelkov.testrestapp.services;

import ru.strelkov.testrestapp.models.Employee;

import java.util.List;


public interface EmployeeService {
    Employee getById(Long id);

    void deleteById(Long id);

    void save(Employee employee);

    List<Employee> getAll();
}
