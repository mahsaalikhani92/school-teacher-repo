package com.school;

import com.school.enums.Degree;
import com.school.enums.TeacherType;

public class PartTimeTeacher extends Teacher {
    private int hourlySalary;
    private int hourPerMonth;

    public PartTimeTeacher(String name, String lastName, String personalCode, Degree degree, TeacherType type, Integer experienceYear, int hourPerMonth, int hourlySalary) {
        super(name, lastName, personalCode, degree, type, experienceYear);
        this.hourlySalary = hourlySalary;
        this.hourPerMonth = hourPerMonth;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHourPerMonth() {
        return hourPerMonth;
    }

    public void setHourPerMonth(int hourPerMonth) {
        this.hourPerMonth = hourPerMonth;
    }

    @Override
    public Double calculateSalary() {
        double baseSalary = hourlySalary * hourPerMonth;
        return baseSalary - super.calculateInsurance(baseSalary) - super.calculateTax(baseSalary);
    }
}
