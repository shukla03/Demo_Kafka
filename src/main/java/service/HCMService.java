package service;


import entity.HCM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HCMService {
    @Autowired
    HCMRepository repository;

    // CREATE
    public HCM createEmployee(HCM hcm) {
        return repository.save(hcm);
    }

    // READ
    public List<HCM> getEmployees() {
        return repository.findAll();
    }


    // UPDATE
    public HCM updateEmployee(long employeeid, HCM hcmDetails) {
        HCM hcm = repository.getOne(employeeid);
        hcm.setEmployeeid(hcmDetails.getEmployeeid());
        hcm.setExperience(hcmDetails.getExperience());
        hcm.setClientAppreciationForCurrentYear(hcmDetails.isClientAppreciationForCurrentYear());
        hcm.setGoalCompletedForCurrentYear(hcmDetails.isGoalCompletedForCurrentYear());
        hcm.setYearsInCurrentRole(hcmDetails.getYearsInCurrentRole());

        return repository.save(hcm);
    }

}
