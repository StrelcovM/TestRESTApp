package ru.strelkov.testrestapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.strelkov.testrestapp.models.Employee;
import ru.strelkov.testrestapp.repository.EmployeeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee getById(Long id) {
        Optional<Employee> bookmark = this.employeeRepo.findById(id);
        return bookmark.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

}
