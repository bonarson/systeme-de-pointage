package com.projet1_systeme.projet_1.employe;


import com.projet1_systeme.projet_1.model.Category;
import com.projet1_systeme.projet_1.model.Employee;
import lombok.Getter;

import java.util.Date;

@Getter
public class Driver extends Employee {


    public Driver(String lastName, String firstName, String employeeNumber, Date hireDate, Date contractEndDate, float salaryAmount, Category category) {
        super(lastName, firstName, employeeNumber, hireDate, contractEndDate, salaryAmount, category);
    }
}
