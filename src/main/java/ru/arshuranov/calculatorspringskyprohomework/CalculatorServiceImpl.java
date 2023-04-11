package ru.arshuranov.calculatorspringskyprohomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greeting() {
        return "<em><b><big> Добро пожаловать в калькулятор!</big></b></em>";
    }

    public String sum(String num1, String num2) {
        if ((num1.length() < 1) || (num2.length() < 1)) {
            return "Необходимо передать два числа";
        } else {
            return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
        }
    }

    public String subtraction(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return new String("На 0 делить нельзя");
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }


}
