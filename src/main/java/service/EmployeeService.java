package service;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    // CREATE
    public Employee createEmployee(Employee emp) {
        if(emp.isActive()== true){
            return repository.findAll(emp.getEmployeeid());
        }
        return repository.save(emp);
    }

    // READ
    public List<Employee> getEmployees() {
        return repository.findAll();
    }


    // UPDATE
    public Employee updateEmployee(long employeeid, Employee employeeDetails) {
        Employee emp = repository.getOne(employeeid);
        emp.setAddress(employeeDetails.getAddress());
        emp.setActive(employeeDetails.isActive());
        emp.setEmployeeid(employeeDetails.getEmployeeid());
        emp.setAge(employeeDetails.getAge());
        emp.setGender(employeeDetails.getGender());
        emp.setName(employeeDetails.getName());

        return repository.save(emp);
    }
//Delete / remove incase null or inactive
    public void deleteEmployee(Long employee) {
        List<Employee> list1 =    new ArrayList<Employee>();
        list1.removeIf(e -> e.getEmployeeid().equals(null));


    }
}
