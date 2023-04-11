package ru.arshuranov.calculatorspringskyprohomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping(path = "/calculator")
    public String sum(@RequestParam("plus") int num1, int num2) {
        return calculatorService.sum(num1, num2);
    }
}
