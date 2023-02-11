package com.github.sant0x00.model;

import java.math.BigDecimal;

public enum Performance {
  TO_WISH {
    @Override
    public BigDecimal percentageReadjustment() {
      return new BigDecimal("0.05");
    }
  },
  EXPECTED {
    @Override
    public BigDecimal percentageReadjustment() {
      return new BigDecimal("0.15");
    }
  },
  ABOVE_EXPECTED {
    @Override
    public BigDecimal percentageReadjustment() {
      return new BigDecimal("0.2");
    }
  };

  public abstract BigDecimal percentageReadjustment();
}
