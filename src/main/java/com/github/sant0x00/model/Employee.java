package com.github.sant0x00.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {
  private String name;
  private LocalDate dateAdmission;
  private BigDecimal salary;

  public Employee(String name, LocalDate dateAdmission, BigDecimal salary) {
    this.name = name;
    this.dateAdmission = dateAdmission;
    this.salary = salary;
  }

  public String getName() {
      return name;
  }

  public LocalDate getDateAdmission() {
      return dateAdmission;
  }

  public BigDecimal getSalary() {
      return salary;
  }

  public BigDecimal readjustSalary(BigDecimal readjust) {
    return this.salary = this.salary.add(readjust).setScale(2, RoundingMode.HALF_UP);
  }
}
