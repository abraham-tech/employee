package miu.edu.abc.employee_management.repository;

import miu.edu.abc.employee_management.entity.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {
}
