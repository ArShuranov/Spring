package ru.arshuranov.calculatorspringskyprohomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greeting() {
        return "<em><b><big> Добро пожаловать в калькулятор!</big></b></em>";
    }

    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }


    public Integer subtraction(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }

}
