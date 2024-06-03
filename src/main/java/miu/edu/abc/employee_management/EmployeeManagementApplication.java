package miu.edu.abc.employee_management;

import lombok.RequiredArgsConstructor;
import miu.edu.abc.employee_management.entity.Employee;
import miu.edu.abc.employee_management.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeManagementApplication implements CommandLineRunner {

    private final EmployeeService employeeService;
    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.save(new Employee("John", "Doe", 50000));
        employeeService.save(new Employee("Jane", "Dona", 50000));
        employeeService.save(new Employee("Alice", "Smith", 60000));
        employeeService.save(new Employee("Bob", "Brown", 45000));

        List<Employee> employees = employeeService.findAll();
        System.out.println(employees);

    }
}
