package com.projet1_systeme.projet_1.employe;

import com.projet1_systeme.projet_1.model.Category;
import com.projet1_systeme.projet_1.model.Employee;
import lombok.Getter;

import java.util.Date;

@Getter
public class Gardien extends Employee {


    public Gardien(String lastName, String firstName, String employeeNumber, Date hireDate, Date contractEndDate, float salaryAmount, Category category) {
        super(lastName, firstName, employeeNumber, hireDate, contractEndDate, salaryAmount, category);
    }

    @Override
    public String toString() {
        return "Gardien{" +super.getEmployeeNumber();

    }
}
