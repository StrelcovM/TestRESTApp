package ru.strelkov.testrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.strelkov.testrestapp.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
