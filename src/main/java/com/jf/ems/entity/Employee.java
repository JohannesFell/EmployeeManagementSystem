package com.jf.ems.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TBL_EmployeeManagement")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;

    private String empFirstName;
    private String empLastName;
    private Date empBirthDate;
    private String empDepartment;

    public Employee(){}

    public Employee( String empFirstName, String empLastName, Date empBirthDate, String empDepartment )
    {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empBirthDate = empBirthDate;
        this.empDepartment = empDepartment;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
}
