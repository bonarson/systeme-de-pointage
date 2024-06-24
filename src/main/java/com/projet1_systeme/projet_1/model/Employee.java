package com.projet1_systeme.projet_1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class Employee {
    private String lastName;
    private String firstName;
    private String employeeNumber;
    private Date hireDate;
    private Date contractEndDate;
    private float salaryAmount;
    private Category category;

    public int work(Calendar calendar, List<Pointage> pointageList){
        return 0;
    }
}
