package ru.arshuranov.calculatorspringskyprohomework;

public interface CalculatorService {
    String greeting();

    String sum(Integer num1, Integer num2);

    String subtraction(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(int num1, int num2);

}
