package miu.edu.abc.employee_management.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.abc.employee_management.entity.Employee;
import miu.edu.abc.employee_management.repository.EmployeeRepository;
import miu.edu.abc.employee_management.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll().stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getLastName, Comparator.reverseOrder())).toList();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        employeeRepository.findById(employee.getId()).ifPresent(e -> employeeRepository.save(employee));
        return employee;
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.findById(employee.getId()).ifPresent(e -> employeeRepository.delete(employee));
    }
}
