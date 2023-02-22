package com.github.sant0x00.service;

import com.github.sant0x00.builder.EmployeeBuilder;
import com.github.sant0x00.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {
  @Test
  @DisplayName("should return bonus of salary of an employee when the payment is smaller what 100k")
  void calculateBonusTest() {
    // given
    final var salary = new BigDecimal(500);
    final var expectedBonus = new BigDecimal(50).setScale(2, RoundingMode.HALF_UP);
    final var employee = new EmployeeBuilder().withName("test").withSalary(salary).build();

    // when
    final var actualBonus = BonusService.calculateBonus(employee);

    // then
    assertEquals(expectedBonus, actualBonus);
  }

  @Test
  @DisplayName("should return to exception if the employee's salary is greater than 100k")
  void bonusExceptionTest() {
    // given
    final var employee = new EmployeeBuilder().withName("test").build();

    // when
    final Consumer<Employee> runnable = BonusService::calculateBonus;

    // then
    assertThrows(IllegalArgumentException.class, () -> runnable.accept(employee));
  }
}
