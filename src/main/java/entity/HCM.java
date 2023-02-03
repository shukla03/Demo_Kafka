package entity;


import javax.persistence.*;

@Entity
@Table(name = "hcm")
public class HCM {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    long employeeid;

    @Column(name = "experience")
    String experience;

    @Column(name = "yearsInCurrentRole")
    int yearsInCurrentRole;

    @Column(name = "goalCompletedForCurrentYear")
    boolean goalCompletedForCurrentYear;

    @Column(name = "clientAppreciationForCurrentYear")
    boolean clientAppreciationForCurrentYear;

    @Column(name = "isEligibleForPromotion")
    boolean isEligibleForPromotion;


    public HCM() {
        this.employeeid = employeeid;
        this.experience = experience;
        this.yearsInCurrentRole = Integer.parseInt(String.valueOf(yearsInCurrentRole));
        this.clientAppreciationForCurrentYear = clientAppreciationForCurrentYear;
        this.goalCompletedForCurrentYear = goalCompletedForCurrentYear;
        this.isEligibleForPromotion = isEligibleForPromotion;

    }

    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getYearsInCurrentRole() {
        return yearsInCurrentRole;
    }

    public void setYearsInCurrentRole(int yearsInCurrentRole) {
        this.yearsInCurrentRole = yearsInCurrentRole;
    }

    public boolean isGoalCompletedForCurrentYear() {
        return goalCompletedForCurrentYear;
    }

    public void setGoalCompletedForCurrentYear(boolean goalCompletedForCurrentYear) {
        this.goalCompletedForCurrentYear = goalCompletedForCurrentYear;
    }

    public boolean isClientAppreciationForCurrentYear() {
        return clientAppreciationForCurrentYear;
    }

    public void setClientAppreciationForCurrentYear(boolean clientAppreciationForCurrentYear) {
        this.clientAppreciationForCurrentYear = clientAppreciationForCurrentYear;
    }

    public boolean isEligibleForPromotion() {
        return isEligibleForPromotion;
    }

    public void setEligibleForPromotion(boolean eligibleForPromotion) {
        isEligibleForPromotion = eligibleForPromotion;
    }

    @Override
    public String toString() {
        return "EmployeeId : " + employeeid + ", Experience : " + experience + ", YearsInCurrentRole : " + yearsInCurrentRole + ", ClientAppreciationForCurrentYear : " + clientAppreciationForCurrentYear + ", GoalCompletedForCurrentYear : " + goalCompletedForCurrentYear + ", isEligibleForPromotion : " + isEligibleForPromotion;

    }

}