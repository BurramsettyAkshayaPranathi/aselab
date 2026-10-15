package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/** Tests for {@link Calculator}. */
class CalculatorTest {
  @Test
  void addsNumbers() {
    assertEquals(7, Calculator.add(3, 4));
  }

  @Test
  void subtractsNumbers() {
    assertEquals(2, Calculator.subtract(5, 3));
  }

  @Test
  void multipliesNumbers() {
    assertEquals(12, Calculator.multiply(3, 4));
  }

  @Test
  void dividesNumbers() {
    assertEquals(2.5, Calculator.divide(5, 2));
  }

  @Test
  void rejectsDivisionByZero() {
    assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0));
  }
}
