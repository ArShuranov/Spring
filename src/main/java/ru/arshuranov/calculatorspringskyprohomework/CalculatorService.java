package ru.arshuranov.calculatorspringskyprohomework;

public interface CalculatorService {
    String greeting();

    String sum(String num1, String num2);

    String subtraction(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(int num1, int num2);

}
