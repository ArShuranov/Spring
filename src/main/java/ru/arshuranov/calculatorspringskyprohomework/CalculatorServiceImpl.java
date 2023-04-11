package ru.arshuranov.calculatorspringskyprohomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greeting() {
        return "<em><b> <big> Добро пожаловать в калькулятор!</em></big></b>";
    }

    public String sum (int num1, int num2) {
        return "num1 + num2 = " + (num1 + num2);
    }



}
