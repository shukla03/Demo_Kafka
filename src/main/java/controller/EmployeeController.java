package controller;


import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService empService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> readEmployees() {
        return empService.getEmployees();
    }

    @RequestMapping(value = "/employees/{employee_id}", method = RequestMethod.PUT)
    public Employee readEmployees(@PathVariable(value = "employee_id") Long employeeid, @RequestBody Employee empDetails) {
        return empService.updateEmployee(employeeid, empDetails);
    }

    @RequestMapping(value = "/employees/{employee_id}", method = RequestMethod.DELETE)
    public void deleteEmployees(@PathVariable(value = "employee_id") Long employeeid) {
        empService.deleteEmployee(employeeid);
    }

}