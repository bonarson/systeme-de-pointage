package com.projet1_systeme.projet_1.employe;

import com.projet1_systeme.projet_1.model.Category;
import com.projet1_systeme.projet_1.model.Employee;
import lombok.Getter;

import java.util.Date;

@Getter
public class Guardian extends Employee {


    public Guardian(String lastName, String firstName, String serialNumberEmployee, Date hireDate, Date contractEndDate, float salaryAmount, Category category) {
        super(lastName, firstName, serialNumberEmployee, hireDate, contractEndDate, salaryAmount, category);
    }

}
