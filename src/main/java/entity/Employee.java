package entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    Long employeeid;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

    @Column(name = "gender")
    String gender;

    @Column(name = "address")
    String address;

    @Column(name = "isActive")
    boolean isActive;


    public Employee() {
        this.employeeid = employeeid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.isActive = isActive;

    }

    public Long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Long employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    @Override
    public String toString() {
        return "EmployeeId : " + employeeid + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Address : " + address + ", IsActive : " + isActive;

    }
}
