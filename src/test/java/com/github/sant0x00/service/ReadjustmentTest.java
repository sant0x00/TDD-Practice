package com.github.sant0x00.service;

import com.github.sant0x00.builder.EmployeeBuilder;
import com.github.sant0x00.model.Performance;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadjustmentTest {
  @Test
  @DisplayName("should return salary multiply 5% when the performance of an employee is to wish")
  void toWishTest() {
    // given
    final var service = new ReadjustmentService();
    final var employee = new EmployeeBuilder().withName("test").build();

    // when
    final var result = service.readjustment(employee, Performance.TO_WISH);

    // then
    assertEquals(result, employee.getSalary());
  }

  @Test
  @DisplayName("should return salary multiply 15% when the performance of an employee is to expected")
  void expectedTest() {
    // given
    final var service = new ReadjustmentService();
    final var employee = new EmployeeBuilder().withName("test").build();

    // when
    final var result = service.readjustment(employee, Performance.EXPECTED);

    // then
    assertEquals(result, employee.getSalary());
  }

  @Test
  @DisplayName("should return salary multiply 20% when the performance of an employee is to above expected")
  void aboveExpectedTest() {
    // given
    final var service = new ReadjustmentService();
    final var employee = new EmployeeBuilder().withName("test").build();

    // when
    final var result = service.readjustment(employee, Performance.ABOVE_EXPECTED);

    // then
    assertEquals(result, employee.getSalary());
  }
}
