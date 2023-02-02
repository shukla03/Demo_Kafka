package controller;

import entity.Employee;
import entity.HCM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.HCMService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HCMController {
    @Autowired
    HCMService hcmService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<HCM> readEmployees() {
        return hcmService.getEmployees();
    }

    @RequestMapping(value = "/employees/{employeeid}", method = RequestMethod.PUT)
    public HCM readEmployees(@PathVariable(value = "employeeid") Long id, @RequestBody HCM hcmDetails) {
        return hcmService.updateEmployee(id, hcmDetails);
    }

    }