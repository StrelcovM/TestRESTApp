package ru.strelkov.testrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.strelkov.testrestapp.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
