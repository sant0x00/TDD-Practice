package com.github.sant0x00.builder;

import com.github.javafaker.Faker;
import com.github.sant0x00.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class EmployeeBuilder {
  private final Faker faker = new Faker();
  private String name;
  private LocalDate dateAdmission = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
  private BigDecimal salary = new BigDecimal(faker.number().randomDouble(2, 10000, 100000));

  public Employee build() {
    return new Employee(name, dateAdmission, salary);
  }

  public EmployeeBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public EmployeeBuilder withSalary(BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  public EmployeeBuilder withDateAdmission(LocalDate dateAdmission) {
    this.dateAdmission = dateAdmission;
    return this;
  }
}
