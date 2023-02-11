package com.github.sant0x00.service;

import com.github.sant0x00.model.Employee;
import com.github.sant0x00.model.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {
  public BigDecimal readjustment(Employee employee, Performance performance) {
    final var percentage = performance.percentageReadjustment();
    final var readjust = employee.getSalary().multiply(percentage);
    return employee.readjustSalary(readjust);
  }
}
