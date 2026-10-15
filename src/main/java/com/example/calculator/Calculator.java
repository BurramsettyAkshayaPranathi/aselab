package com.example.calculator;

/** Performs basic arithmetic operations. */
public final class Calculator {
  private Calculator() {
    // Utility class.
  }

  /** Returns the sum of two numbers. */
  public static double add(double first, double second) {
    return first + second;
  }

  /** Returns the result of subtracting the second number from the first. */
  public static double subtract(double first, double second) {
    return first - second;
  }

  /** Returns the product of two numbers. */
  public static double multiply(double first, double second) {
    return first * second;
  }

  /** Returns the result of dividing the first number by the second. */
  public static double divide(double dividend, double divisor) {
    if (divisor == 0) {
      throw new IllegalArgumentException("cannot divide by zero");
    }
    return dividend / divisor;
  }
}
