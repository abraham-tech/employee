package miu.edu.abc.employee_management.service;

import miu.edu.abc.employee_management.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee save(Employee employee);
    Employee update(Employee employee);
    void delete(Employee employee);
}
