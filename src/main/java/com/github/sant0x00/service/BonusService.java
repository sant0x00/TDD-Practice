package com.github.sant0x00.service;

import com.github.sant0x00.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
  public static final BigDecimal MAX_ALLOWED_BONUS = new BigDecimal("1000");
  public static final int SCALE = 2;
  public static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

  public static BigDecimal calculateBonus(Employee employee) {
    final var bonusPercentage = new BigDecimal("0.1");
    final var bonus = employee.getSalary().multiply(bonusPercentage).setScale(SCALE, ROUNDING_MODE);

    if (bonus.compareTo(MAX_ALLOWED_BONUS) > 0) {
      throw new IllegalArgumentException("An employee with salary higher than 100k does not receive a bonus");
    }
    return bonus;
  }
}
